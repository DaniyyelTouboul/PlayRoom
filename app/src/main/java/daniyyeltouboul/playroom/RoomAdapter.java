package daniyyeltouboul.playroom;


import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Daniyyel on 08/02/2017.
 */

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    ArrayList<Room> rooms;
    myRoomAdapterListner listner;
    String imageUrl = "http://www.atpworldtour.com/-/media/tennis/players/gladiator/2016/daniel_full_16.png";

    public void setListner(myRoomAdapterListner listner) {
        this.listner = listner;
    }

    public RoomAdapter(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    public interface myRoomAdapterListner {
        void onRoomClick(int position, View view);

    }

    class RoomViewHolder extends RecyclerView.ViewHolder {


        ImageView profilePhoto;
        TextView userName;
        TextView joinTime;
        TextView genres;
        TextView songName;
        TextView artistName;
        ImageView videoPhoto;
        TextView songNumber;
        TextView userNumber;




        public RoomViewHolder(final View itemView) {
            super(itemView);
            profilePhoto = (ImageView) itemView.findViewById(R.id.profilePictureFeed);
            userName = (TextView)itemView.findViewById(R.id.profileNameFeed);
            joinTime = (TextView)itemView.findViewById(R.id.timeForRoomFeed);
            genres = (TextView)itemView.findViewById(R.id.generesDisFeed);
            songName = (TextView)itemView.findViewById(R.id.songNameFeed);
            artistName = (TextView)itemView.findViewById(R.id.artistNameFeed);
            videoPhoto = (ImageView)itemView.findViewById(R.id.videoPhotoFeed);
            songNumber = (TextView)itemView.findViewById(R.id.songCounterFeed);
            userNumber = (TextView)itemView.findViewById(R.id.usersInsideFeed);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listner.onRoomClick(getAdapterPosition(),view);
                }
            });

        }
    }

    @Override
    public RoomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview1,parent,false);
        RoomViewHolder RoomViewHolder = new RoomViewHolder(v);
        return RoomViewHolder;
    }

    @Override
    public void onBindViewHolder(RoomAdapter.RoomViewHolder holder, int position) {
        Room Room = rooms.get(position);

        Picasso.with(RoomAdapter.this).load(imageUrl).resize(50, 50).centerCrop().into(profilePhoto)
        holder.profilePhoto.setImageBitmap(Room.getProfilePhoto());
        holder.userName.setText(Room.getUserName());
        holder.joinTime.setText(Room.getJoinTime());
        holder.genres.setText(Room.getGenres());
        holder.songName.setText(Room.getSongName());
        holder.artistName.setText(Room.getArtistName());
        holder.videoPhoto.setImageBitmap(Room.getVideoPhoto());
        holder.songNumber.setText(Room.getSongNumber());
        holder.userNumber.setText(Room.getUserNumber());
    }


    @Override
    public int getItemViewType(int position) {
        return 1;
    }
}

