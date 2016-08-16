package apine.mentor.com.anasotak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import apine.mentor.com.anasotak.Lit.CharAR;
import apine.mentor.com.anasotak.Lit.GifView;
import apine.mentor.com.anasotak.Lit.style;
import apine.mentor.com.anasotak.Lit.work;
import pl.droidsonroids.gif.GifImageView;

public class Hrof extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrof);
        style backg =new style();
final RelativeLayout ly=(RelativeLayout)findViewById(R.id.ly);
        backg.rant();
        ly.setBackgroundResource(backg.getBg1());
final pl.droidsonroids.gif.GifImageView gifl;
       final
        ImageButton next ,back;
        gifl= (GifImageView) findViewById(R.id.gifl);

        next=(ImageButton) findViewById(R.id.next);
        back=(ImageButton) findViewById(R.id.back);
       final ImageView hand , png;
        png=(ImageView) findViewById(R.id.png);
        hand=(ImageView) findViewById(R.id.hand);
       final TextView h = (TextView) findViewById(R.id.h);
        final TextView names  =(TextView)findViewById(R.id.names);
        names.setText(CharAR.names[work.k]);
        h.setText(CharAR.abjde[work.k]);
        png.setImageResource(CharAR.ani[work.k]);
        hand.setImageResource(CharAR.han[work.k]);
        gifl.setImageResource(CharAR.gf[work.k]);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(work.k==27){
                 Toast.makeText(Hrof.this,"هذا اخر حرف",Toast.LENGTH_LONG).show();
                }else {
                    work.k++;
                    h.setText(CharAR.abjde[work.k]);
                    names.setText(CharAR.names[work.k]);
                    png.setImageResource(CharAR.ani[work.k]);
                    hand.setImageResource(CharAR.han[work.k]);
                    gifl.setImageResource(CharAR.gf[work.k]);
                }
                }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(work.k==0){
                 Toast.makeText(Hrof.this, "هذا اول حرف",Toast.LENGTH_LONG).show();
                }else {
                    work.k--;
                    h.setText(CharAR.abjde[work.k]);
                    png.setImageResource(CharAR.ani[work.k]);
                    hand.setImageResource(CharAR.han[work.k]);
                    gifl.setImageResource(CharAR.gf[work.k]);
                    names.setText(CharAR.names[work.k]);

                }
                }
        });
    }
}
