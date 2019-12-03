package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.webschoolwork.Fragment.Fragment1;
import com.example.webschoolwork.Fragment.Fragment2;
import com.example.webschoolwork.Fragment.Fragment3;
import com.example.webschoolwork.Fragment.Fragment4;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<String> tab_title_list = new ArrayList<>();//存放标签页标题
    private ArrayList<Fragment> fragment_list = new ArrayList<>();//存放ViewPager下的Fragment
    private Fragment fragment1, fragment2, fragment3, fragment4;
    private MyFragmentPagerAdapter adapter;//适配器

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
            tabLayout =  findViewById(R.id.tl_1);
            viewPager =  findViewById(R.id.vp_1);
            tab_title_list.add("页面1");
            tab_title_list.add("页面2");
            tab_title_list.add("页面3");
            tab_title_list.add("页面4");
            tabLayout.addTab(tabLayout.newTab().setText(tab_title_list.get(0)));
            tabLayout.addTab(tabLayout.newTab().setText(tab_title_list.get(1)));
            tabLayout.addTab(tabLayout.newTab().setText(tab_title_list.get(2)));
            tabLayout.addTab(tabLayout.newTab().setText(tab_title_list.get(3)));
            fragment1 = new Fragment1();
            fragment2 = new Fragment2();
            fragment3 = new Fragment3();
            fragment4 = new Fragment4();
            fragment_list.add(fragment1);
            fragment_list.add(fragment2);
            fragment_list.add(fragment3);
            fragment_list.add(fragment4);
            adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), tab_title_list, fragment_list);
            viewPager.setAdapter(adapter);//给ViewPager设置适配器
            tabLayout.setupWithViewPager(viewPager);//将TabLayout与Viewpager联动起来

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        Toast.makeText(Main3Activity.this,"This is first fragment",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(Main3Activity.this,"This is second fragment",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(Main3Activity.this,"This is third fragment",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(Main3Activity.this,"This is fourth fragment",Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        }
}
