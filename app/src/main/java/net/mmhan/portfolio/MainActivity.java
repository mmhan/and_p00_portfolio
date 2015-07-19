package net.mmhan.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    Button mSpotifyBtn, mScoresAppBtn, mLibraryAppBtn, mBuildItBiggerBtn, mXyzReaderBtn, mCapstoneBtn;

    ArrayList<Button> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyBtn = (Button) findViewById(R.id.spotify_streamer_btn);
        mSpotifyBtn.setOnClickListener(this);
        mScoresAppBtn = (Button) findViewById(R.id.scores_app_btn);
        mScoresAppBtn.setOnClickListener(this);
        mLibraryAppBtn = (Button) findViewById(R.id.library_app_btn);
        mLibraryAppBtn.setOnClickListener(this);
        mBuildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger_btn);
        mBuildItBiggerBtn.setOnClickListener(this);
        mXyzReaderBtn = (Button) findViewById(R.id.xyz_reader_btn);
        mXyzReaderBtn.setOnClickListener(this);
        mCapstoneBtn = (Button) findViewById(R.id.my_own_app_btn);
        mCapstoneBtn.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        Toast.makeText(this,
                String.format("This button will launch %s", btn.getText()),
                Toast.LENGTH_LONG).show();
    }
}
