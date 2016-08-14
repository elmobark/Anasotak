package apine.mentor.com.anasotak;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

import apine.mentor.com.anasotak.Lit.CharAR;

public class Test extends AppCompatActivity {
    private  EditText wx = null;
    private Random rn =new Random();
    private int x=rn.nextInt(27-0+1)+0;
    private ImageView rx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        rx =(ImageView) findViewById(R.id.rx);
      wx=(EditText) findViewById(R.id.wx);
        final Button dx =(Button)findViewById(R.id.dx);


        rx.setImageResource(CharAR.han[x]);

        dx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lk =wx.getText().toString();

                if(lk.isEmpty()){
                    dia("اكتب الاجابة ف مربع الحوار لا يمكن تركها فارغة",false);
                }else {
                if(lk.charAt(0)==CharAR.abjde[x].charAt(0)){
                    dia("اجابتك صحيحة:)",true);

                }else{
                    dia("اجابتك خاطئة :( حاول مرة اخري الاجابة ليست "+lk,false);

                }wx.setText("");
            }}
        });
        wx.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE) {
                    dx.performClick();
                    return true;
                }
                return false;
            }
        });
    } public void dia (String mess, boolean j){

        AlertDialog.Builder builder =new AlertDialog.Builder(Test.this);
        View li =View.inflate(Test.this,R.layout.tar,null);
        builder.setView(li);
        final ImageView so =(ImageView) li.findViewById(R.id.so);
        final TextView mano =(TextView) li.findViewById(R.id.mano);

        if(j) {
            so.setImageResource(R.drawable.tuu);
            mano.setText(mess);
            mano.setTextColor(ContextCompat.getColor(Test.this,R.color.yes));
            builder.setPositiveButton("التالي", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    x=rn.nextInt(27-0+1)+0;
                    rx.setImageResource(CharAR.han[x]);

                    dialogInterface.dismiss();

                }
            });
        }else {
            so.setImageResource(R.drawable.faa);
            mano.setText(mess);
            mano.setTextColor(ContextCompat.getColor(Test.this,R.color.no));

            builder.setNegativeButton("تغير الاشارة؟", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    x=rn.nextInt(27-0+1)+0;
                    rx.setImageResource(CharAR.han[x]);

                    dialogInterface.dismiss();
                }
            });
            builder.setPositiveButton("حاول مرة اخري", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.dismiss();
                }
            });wx.setText("");

        }builder.create().show();
    }
}
