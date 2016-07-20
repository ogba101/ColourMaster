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

    public void btnstartgame(View v )
    {
        Intent intent = new Intent(this,game_session_red.class);
        startActivity(intent);
    }
}
