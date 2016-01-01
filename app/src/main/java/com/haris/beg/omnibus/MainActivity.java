package com.haris.beg.omnibus;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.haris.beg.omnibus.utils.MyAlertDialogManager;
import com.haris.beg.omnibus.utils.MyAnimationManager;
import com.haris.beg.omnibus.utils.MyConnectivityManager;
import com.haris.beg.omnibus.utils.MyToastManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button connectivityCheckBtn = (Button) findViewById(R.id.connectivity_check_btn);
        connectivityCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connectivityCheckBtnHandler(connectivityCheckBtn);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //this method is executed when the Connectivity Check button is clicked
    protected void connectivityCheckBtnHandler(Button button) {
        Context context = this;
        //Context context = getApplicationContext();
        MyAnimationManager.getInstance().animateButton(button);
        if (MyConnectivityManager.getInstance().isConnected(context)) {
            MyToastManager.getInstance().displayShortToast(context, getString(R.string.ur_connected));
            MyAlertDialogManager.getInstance().showAlert("Connectivity Status", getString(R.string.ur_connected), this);
        } else {
            MyToastManager.getInstance().displayShortToast(context, getString(R.string.ur_not_connected));
            MyAlertDialogManager.getInstance().showAlert("Connectivity Status", getString(R.string.ur_not_connected), this);
        }
    }
}
