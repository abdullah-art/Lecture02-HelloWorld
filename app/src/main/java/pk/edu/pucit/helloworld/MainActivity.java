package pk.edu.pucit.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = findViewById(R.id.text);
        tv.setText(counter + "");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tv.setText(counter + "");
            }
        };
        View.OnClickListener declistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                tv.setText(counter + "");
            }
        };
        View.OnClickListener resetListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                tv.setText(counter + "");
            }
        };
        ImageView btn_inc = findViewById(R.id.btn);
        btn_inc.setOnClickListener(listener);
        ImageView btn_dec = findViewById(R.id.btn1);
        btn_dec.setOnClickListener(declistener);
        Button reset =findViewById(R.id.button);
        reset.setOnClickListener(resetListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu_reset){
            counter=0;
            tv.setText(counter + "");
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }
}
