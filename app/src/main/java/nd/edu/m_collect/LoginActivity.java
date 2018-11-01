package nd.edu.m_collect;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by jerry on 10/31/18.
 */

public class LoginActivity extends AppCompatActivity{

    private Toolbar toolbar;
    private NavigationView nDrawer;
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Set toolbar for this screen
        toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        toolbar.setTitle("");
        TextView main_title = (TextView) findViewById(R.id.login_toolbar_title);
        main_title.setText("Sign in");
        setSupportActionBar(toolbar);

        // Set navigation drawer for this screen
        mDrawer = (DrawerLayout) findViewById(R.id.login_drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this,mDrawer, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        mDrawer.addDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
        nDrawer = (NavigationView) findViewById(R.id.nav_view);
        setNavDrawer();
    }

    // Private methods
    // Handle when the a navigation item is selected
    private void setNavDrawer() {
        nDrawer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
//                performAction(item);
                return true;
            }
        });
    }
}
