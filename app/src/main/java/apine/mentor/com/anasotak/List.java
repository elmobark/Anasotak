package apine.mentor.com.anasotak;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import apine.mentor.com.anasotak.Lit.*;

public class List extends AppCompatActivity {
ListView lv;
   final Context con =this;
    int png;
    String lite;
    String har[] = CharAR.abjde;
    int[] sor =CharAR.ani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final CustomListAdapter adaptery =new CustomListAdapter(this,har,sor);
        lv=(ListView) findViewById(R.id.list);
        lv.setAdapter(adaptery);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                work.k=i;
                Intent ne =new Intent(con,Hrof.class);
                startActivity(ne);
            }
        });
    }
}
