package com.trios.android.trios;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//az
        Button btn1 = (Button) findViewById(R.id.ad);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, first.class));
            }
        });

   //az
        //az

        button = (Button) findViewById(R.id.exit);

        // add button listener
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Do you want to logout ?");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Click yes to logout!")
                        .setCancelable(false)
                        .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                MainActivity.this.finish();
                            }
                        })
                        .setNegativeButton("No",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });
        //az
        Button btn2 = (Button) findViewById(R.id.about);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Further Contact us on ajazf09@gmail.com   " +
                        "An App Done By" +
                        "Abhishekh Achuthankutty" +
                        "F Ajaz" +
                        "Jilu G Vadakoot" , Toast.LENGTH_LONG ).show();
            }
        });
        //az

    }
}
