package project.colormaster;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public class game_session_red extends AppCompatActivity {
    final Context context=this;
    TextToSpeech t1;
    float pitch=(float)(1);
    float rate=(float)(1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_session_red);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setSpeechRate(rate);
                    t1.setPitch(pitch);
                    t1.setLanguage(Locale.US);

                }
            }
        });
        TextView tx = (TextView)findViewById(R.id.thinkTxt_red);
        final String toSpeak = tx.getText().toString();
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/kg.ttf");
        tx.setTypeface(custom_font);
       // Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        }, 1000);
    }
    public void openDialog1(View view) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.diaglayout);
        Button cancelbutton = (Button) dialog.findViewById(R.id.rank_dialog_button1);
        cancelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(context,user_profile_activity.class);
                startActivity(myIntent);
            }
        });
        Button okbutton = (Button) dialog.findViewById(R.id.rank_dialog_button);
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(context,Lesson_Menu_Activity.class);
                startActivity(myIntent);
            }
        });
        dialog.show();
    }

}
