package apine.mentor.com.anasotak;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.util.StringTokenizer;
import java.util.zip.Inflater;

import apine.mentor.com.anasotak.Lit.ConnectivityReceiver;
import apine.mentor.com.anasotak.Lit.nofy;

public class Home extends AppCompatActivity implements ConnectivityReceiver.ConnectivityReceiverListener {
    Button b1, b2;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar to = (Toolbar) findViewById(R.id.to);
        setSupportActionBar(to);
        getSupportActionBar().setIcon(R.mipmap.logo);
        getSupportActionBar().setSubtitle(R.string.subt);
        getSupportActionBar().setTitle(R.string.app_name);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nofy.notify(Home.this, "click", 2);
                Intent aa = new Intent(context, List.class);
                startActivity(aa);
                overridePendingTransition(R.anim.slide_to_the_right, R.anim.slide_to_the_right);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aa = new Intent(context, Test.class);
                startActivity(aa);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.selector, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_cart) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
                View v = View.inflate(Home.this, R.layout.desginsel, null);
                builder.setView(v)
                        .setTitle(String.valueOf(R.string.ti))
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("تم", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {

    }
}
