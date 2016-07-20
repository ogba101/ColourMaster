package project.colormaster;

import android.graphics.Typeface;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class game_session extends AppCompatActivity {
    TextToSpeech t1;
    float pitch=(float)(1.4);
    float rate=(float)(0.9);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_session);
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
        TextView tx = (TextView)findViewById(R.id.thinkTxt);
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

}
