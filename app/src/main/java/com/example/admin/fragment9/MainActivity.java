package com.example.admin.fragment9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show alert dialog group
                MyDialogFragment myDialogFragment=new MyDialogFragment();
                myDialogFragment.show(getSupportFragmentManager(),null);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                MyProgressDialog myProgressDialog=new MyProgressDialog();
                myProgressDialog.show(getSupportFragmentManager(),null);
            }
        });
    }
}
