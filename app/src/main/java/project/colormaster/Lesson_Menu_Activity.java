package project.colormaster;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Lesson_Menu_Activity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson__menu_);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        settingClick();
        return super.onOptionsItemSelected(item);
    }
    public void settingClick()
    {
        Intent myIntent=new Intent(context,Settings_Activity.class);
        startActivity(myIntent);
    }


    public void btnstart_red(View v )
    {
        Intent intent = new Intent(this,game_session_red.class);
        startActivity(intent);
    }

    public void btnstart_orange(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
        startActivity(intent);
    }

    public void btnstart_yellow(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
        startActivity(intent);
    }

    public void btnstart_green(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
        startActivity(intent);
    }

    public void btnstart_blue(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
        startActivity(intent);
    }

    public void btnstart_indigo(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
        startActivity(intent);
    }

    public void btnstart_violet(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
        startActivity(intent);
    }

    public void btnstart_white(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
        startActivity(intent);
    }

    public void btnstart_black(View v )
    {
        Intent intent = new Intent(this,game_session_orange.class);
     startActivity(intent);
    }
}
