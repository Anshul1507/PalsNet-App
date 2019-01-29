package friendship_day.codexonic.com.friendship_day;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class home_activity extends AppCompatActivity {
private android.support.v7.widget.Toolbar toolbar;
    private Dialog rankDialog;
    private DrawerLayout mDrawerLayout;
    private Float rate;
    private int pop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.menu);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        ArrayList<CustomList> customLists = new ArrayList<CustomList>();
        customLists.add(new CustomList("Vivek Maurya",R.drawable.f1));
        customLists.add(new CustomList("Ankur Purwar",R.drawable.f2));
        customLists.add(new CustomList("Suarav Bahdauria",R.drawable.f3));
        customLists.add(new CustomList("Shashank Rajput",R.drawable.f4));
        customLists.add(new CustomList("Akash Agrawal",R.drawable.f5));
        customLists.add(new CustomList("Riya Singh",R.drawable.f6));
        customLists.add(new CustomList("Shubham Prajapati",R.drawable.f7));
        customLists.add(new CustomList("Adi Anand",R.drawable.f8));
        customLists.add(new CustomList("Nishant Sharma",R.drawable.f9));
        customLists.add(new CustomList("Krishnanand Upadhayay",R.drawable.f10));

        CustomListAdapter adapter = new CustomListAdapter(this,customLists);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                pop = position + 1;
                details();
            }
        });

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        int id = menuItem.getItemId();

                        if (id == R.id.nav_rate) {
                            showDialog();
                        } else if (id == R.id.nav_about) {
                             About();
                        } else if (id == R.id.nav_feedback) {
                            Intent intent = new Intent(Intent.ACTION_SENDTO);
                            intent.setData(Uri.parse("mailto: ag1407anshul@gmail.com"));
                            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback for this App");
                            if (intent.resolveActivity(getPackageManager()) != null) {
                                startActivity(intent);
                            }
                        }
                        else if(id == R.id.nav_exit)
                        {
                          exit();
                        }
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });
    }
    private void showDialog() {
        rankDialog = new Dialog(home_activity.this, R.style.FullHeightDialog);
        rankDialog.setContentView(R.layout.rank_dialog);
        rankDialog.setCancelable(true);
        final RatingBar ratingBar = (RatingBar) rankDialog.findViewById(R.id.dialog_ratingbar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String action = String.valueOf(rating);
                rate = Float.valueOf(action);
            }
        });
        Button updateButton = (Button) rankDialog.findViewById(R.id.rank_dialog_button);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your Rating is " + rate, Toast.LENGTH_SHORT).show();
                rankDialog.dismiss();
            }
        });
        rankDialog.show();
    }
    private void details() {
        android.content.Intent intentState = new android.content.Intent(getApplicationContext(), detail.class);
        intentState.putExtra("pass", pop);
        startActivity(intentState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void About() {
        Intent about_us = new Intent(home_activity.this, about_me.class);
        startActivity(about_us);
        this.finish();
    }
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(),"See You Soon",Toast.LENGTH_SHORT).show();
        finish();
        super.onBackPressed();
    }
    private void exit()
    {
        System.exit(0);
        this.finish();
    }
}
