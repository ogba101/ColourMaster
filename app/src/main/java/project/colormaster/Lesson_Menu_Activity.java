package project.colormaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lesson_Menu_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson__menu_);
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
