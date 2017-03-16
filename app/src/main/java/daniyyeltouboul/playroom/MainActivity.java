package daniyyeltouboul.playroom;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    ArrayList<Room> rooms;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        rooms = new ArrayList<>();
        rooms.add(new Room(R.drawable.kiss_daniel,"Daniel Tubul","Joined 8 years ago","Rock, pop, Blah","The Woman Behind","Adolf Hitler", "7","10",R.drawable.videophoto));

        Picasso.with(context)
                .load(url)
                .resize(50, 50)
                .centerCrop()
                .into(imageView)
//
//        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        viewPager = (ViewPager)findViewById(R.id.pager);
//
//        adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(adapter);
//
//
//
//        final TabLayout.Tab test01 = tabLayout.newTab().setText("Test 01");
//        final TabLayout.Tab test02 = tabLayout.newTab().setText("Test 02");
//        final TabLayout.Tab test03 = tabLayout.newTab().setText("Test 03");
//
//
//        tabLayout.addTab(test01,0);
//        tabLayout.addTab(test02,1);
//        tabLayout.addTab(test03,2);
//
//
//        tabLayout.setTabTextColors(ContextCompat.getColorStateList(this,R.color.tab_selector_color));
//        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this,R.color.cardview_dark_background));

//        viewPager.addOnAdapterChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener){


//        });
    }

    private void TestUpload() {
        int i = 1+1;
    }
}
