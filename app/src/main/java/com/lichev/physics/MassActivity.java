package com.lichev.physics;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.lichev.physics.R.layout.activity_mass_level1;
import static com.lichev.physics.R.layout.activity_mass_level2;
import static com.lichev.physics.R.layout.activity_mass_level3;
import static com.lichev.physics.R.layout.activity_mass_level4;
import static com.lichev.physics.R.layout.activity_mass_level5;

public class MassActivity extends AppCompatActivity {

    private final int level1 = activity_mass_level1;
    private final int level2 = activity_mass_level2;
    private final int level3 = activity_mass_level3;
    private final int level4 = activity_mass_level4;
    private final int level5 = activity_mass_level5;
    ImageView massImage;
    ImageButton dot1, dot2;
    private int playerScore = 0;
    private TextView txt_playerScore;
    private Button btn_next;
    AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLevel(level1);

        alert = new AlertDialog.Builder(MassActivity.this);
        alert.setTitle("Centre of mass");
        alert.setMessage("You got "+playerScore+"/5 correct!");
        alert.setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                MassActivity.this.finish();
                dialog.dismiss();
            }
        });
    }

   /* This method sets the view to the first or next level,
    * resets the images for the two ImageButtons(yellow dots),
    * and reinstantiates all other elementes of the layout, so that they
    * have full functionality after the view has been changed.
    *
    */
    public void loadLevel(int view){
        setContentView(view);
        resetDots();
        btn_next = (Button)findViewById(R.id.btn_next);
        txt_playerScore = (TextView) findViewById(R.id.playerScore);
        assert txt_playerScore != null;
        txt_playerScore.setText("Score: " + playerScore);

           dot1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   outcome();
                   playerScore++;
                   btn_next.setVisibility(View.VISIBLE);
                   txt_playerScore.setText("Score: " + playerScore);
                   dot1.setOnClickListener(this);
                   Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                   if (playerScore == 5)
                       btn_next.setText("Finish");
               }
           });

           dot2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   outcome();
                   dot2.setOnClickListener(this);
                   txt_playerScore.setText("Score: " + playerScore);
                   alert.setMessage("You got "+playerScore+"/5 correct!");
                   Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_SHORT).show();
                   alert.show();
               }
           });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.setMessage("You got "+playerScore+"/5 correct!");
                if (playerScore == 1){
                    loadLevel(level2);
                }else if (playerScore == 2){
                    loadLevel(level3);
                }else if (playerScore == 3){
                    loadLevel(level4);
                }else if (playerScore == 4){
                    loadLevel(level5);
                }else if (playerScore == 5){
                    alert.show();
                }
                btn_next.setOnClickListener(this);
            }
        });

    }
    void resetDots(){
        massImage = (ImageView)findViewById(R.id.massImage);
        dot1 = (ImageButton)findViewById(R.id.dot1);
        dot2 = (ImageButton)findViewById(R.id.dot2);
        dot1.setImageResource(R.drawable.btn_yellow_rdy);
        dot2.setImageResource(R.drawable.btn_yellow_rdy);
    }

    void outcome(){
        dot1.setImageResource(R.drawable.btn_green_rdy);
        dot2.setImageResource(R.drawable.btn_red_rdy);
    }


}
