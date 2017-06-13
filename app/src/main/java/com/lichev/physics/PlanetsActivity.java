package com.lichev.physics;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;


public class PlanetsActivity extends AppCompatActivity {

    ImageView planet1, planet2, planet3, planet4, planet5, planet6, planet7, planet8;
    Button btn_check;
    //The combination of the correct order of planets for the "Check" button
    private String answer = "mercuryvenusearthmarsjupitersaturnuranusneptune";
    private String submission = null;
    private String ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8;
    private Boolean mIsSpinnerFirstCall = true;

    AlertDialog.Builder alertCheck;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_planets);

          alertCheck = new AlertDialog.Builder(PlanetsActivity.this);
          alertCheck.setTitle("Planets");
          alertCheck.setMessage("");
          alertCheck.setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
              public void onClick(DialogInterface dialog, int which) {
                  PlanetsActivity.this.finish();
                  dialog.dismiss();
              }
          });

          btn_check = (Button)findViewById(R.id.btn_check);

          planet1 = (ImageView) findViewById(R.id.planet_1);
          planet2 = (ImageView) findViewById(R.id.planet_2);
          planet3 = (ImageView) findViewById(R.id.planet_3);
          planet4 = (ImageView) findViewById(R.id.planet_4);
          planet5 = (ImageView) findViewById(R.id.planet_5);
          planet6 = (ImageView) findViewById(R.id.planet_6);
          planet7 = (ImageView) findViewById(R.id.planet_7);
          planet8 = (ImageView) findViewById(R.id.planet_8);

          Spinner spinner1 = (Spinner) findViewById(R.id.planets_spinner1);
          Spinner spinner2 = (Spinner) findViewById(R.id.planets_spinner2);
          Spinner spinner3 = (Spinner) findViewById(R.id.planets_spinner3);
          Spinner spinner4 = (Spinner) findViewById(R.id.planets_spinner4);
          Spinner spinner5 = (Spinner) findViewById(R.id.planets_spinner5);
          Spinner spinner6 = (Spinner) findViewById(R.id.planets_spinner6);
          Spinner spinner7 = (Spinner) findViewById(R.id.planets_spinner7);
          Spinner spinner8 = (Spinner) findViewById(R.id.planets_spinner8);

          ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
          adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

          spinner1.setAdapter(adapter);
          spinner2.setAdapter(adapter);
          spinner3.setAdapter(adapter);
          spinner4.setAdapter(adapter);
          spinner5.setAdapter(adapter);
          spinner6.setAdapter(adapter);
          spinner7.setAdapter(adapter);
          spinner8.setAdapter(adapter);

            //onItemSelected listener for each of the spinners (1-8) below
          spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                  //Check to stop onItemSelected from being called at start of the PlanetsActivity
                  if (!mIsSpinnerFirstCall) {
                      //retrieve the Spinner selection in String format
                      ps1 = parent.getItemAtPosition(position).toString().toLowerCase();
                      //retrieve the resource ID of the file named 'ps1'
                      int resId1 = getResources().getIdentifier(ps1, "drawable", getPackageName());
                      planet1.setImageResource(resId1);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });

          spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                  if (!mIsSpinnerFirstCall) {
                      ps2 = parent.getItemAtPosition(position).toString().toLowerCase();
                      int resId2 = getResources().getIdentifier(ps2, "drawable", getPackageName());
                      planet2.setImageResource(resId2);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });

          spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                  if (!mIsSpinnerFirstCall) {
                      ps3 = parent.getItemAtPosition(position).toString().toLowerCase();
                      int resId3 = getResources().getIdentifier(ps3, "drawable", getPackageName());
                      planet3.setImageResource(resId3);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });

          spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                  if (!mIsSpinnerFirstCall) {
                      ps4 = parent.getItemAtPosition(position).toString().toLowerCase();
                      int resId4 = getResources().getIdentifier(ps4, "drawable", getPackageName());
                      planet4.setImageResource(resId4);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });

          spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                  if (!mIsSpinnerFirstCall) {
                      ps5 = parent.getItemAtPosition(position).toString().toLowerCase();
                      int resId5 = getResources().getIdentifier(ps5, "drawable", getPackageName());
                      planet5.setImageResource(resId5);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });

          spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                  if (!mIsSpinnerFirstCall) {
                      ps6 = parent.getItemAtPosition(position).toString().toLowerCase();
                      int resId6 = getResources().getIdentifier(ps6, "drawable", getPackageName());
                      planet6.setImageResource(resId6);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });

          spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                  if (!mIsSpinnerFirstCall) {
                      ps7 = parent.getItemAtPosition(position).toString().toLowerCase();
                      int resId7 = getResources().getIdentifier(ps7, "drawable", getPackageName());
                      planet7.setImageResource(resId7);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });

          spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                  if (!mIsSpinnerFirstCall) {
                      ps8 = parent.getItemAtPosition(position).toString().toLowerCase();
                      int resId8 = getResources().getIdentifier(ps8, "drawable", getPackageName());
                      planet8.setImageResource(resId8);
                  }
                  mIsSpinnerFirstCall = false;
              }

              public void onNothingSelected(AdapterView<?> arg0) {
              }
          });


          btn_check.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  //create a string of the user submitted order of planets, in order to compare with the answer
                    submission = ps1 + ps2 + ps3 + ps4 + ps5 + ps6 + ps7 + ps8;
                  if (submission.equals(answer) ){
                      alertCheck.setMessage("Correct!");
                      alertCheck.show();
                      submission = null;
                  }else {
                      alertCheck.setMessage("Sorry, that order is incorrect!");
                      alertCheck.show();
                      submission = null;
                  }
              }
          });
      }
}