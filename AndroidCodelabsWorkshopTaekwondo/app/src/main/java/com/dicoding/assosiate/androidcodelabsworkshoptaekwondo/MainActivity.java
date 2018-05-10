package com.dicoding.assosiate.androidcodelabsworkshoptaekwondo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvRedScore;
    private TextView tvBlueScore;
    private TextView tvBlueFoul;
    private TextView tvRedFoul;
    private TextView tvShowLog;

    private Button btnRedPlusSatu;
    private Button btnRedPlusTiga;
    private Button btnRedMinusSetengah;
    private Button btnRedMinusSatu;

    private Button btnBluePlusSatu;
    private Button btnBluePlusTiga;
    private Button btnBlueMinusSetengah;
    private Button btnBlueMinusSatu;

    private Button btnReset;

    private int redScore = 0;
    private int blueScore = 0;
    private double redFoul = 0;
    private double blueFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRedScore = findViewById(R.id.red_score);
        tvBlueScore = findViewById(R.id.blue_score);
        tvRedFoul = findViewById(R.id.activity_main_textView_foul_red);
        tvBlueFoul = findViewById(R.id.activity_main_textView_foul_biru);
        tvShowLog = findViewById(R.id.log_textView);

        btnRedPlusSatu = findViewById(R.id.activity_main_button_plus_satu_red);
        btnRedPlusTiga = findViewById(R.id.activity_main_button_plus_tiga_red);
        btnRedMinusSetengah = findViewById(R.id.activity_main_button_minus_nollima_red);
        btnRedMinusSatu = findViewById(R.id.activity_main_button_minus_satu_red);

        btnBluePlusSatu = findViewById(R.id.activity_main_button_plus_satu_blue);
        btnBluePlusTiga = findViewById(R.id.activity_main_button_plus_tiga_blue);
        btnBlueMinusSetengah = findViewById(R.id.activity_main_button_minus_nollima_blue);
        btnBlueMinusSatu = findViewById(R.id.activity_main_button_minus_satu_blue);

        btnReset = findViewById(R.id.activity_main_button_reset);

        btnRedPlusSatu.setOnClickListener(this);
        btnBluePlusSatu.setOnClickListener(this);
        btnRedPlusTiga.setOnClickListener(this);
        btnBluePlusTiga.setOnClickListener(this);
        btnRedMinusSetengah.setOnClickListener(this);
        btnBlueMinusSetengah.setOnClickListener(this);
        btnRedMinusSatu.setOnClickListener(this);
        btnBlueMinusSatu.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity_main_button_plus_satu_red:
                redScore = redScore + 1;
                tvRedScore.setText(String.valueOf(redScore));
                break;
            case R.id.activity_main_button_plus_satu_blue:
                blueScore = blueScore + 1;
                tvBlueScore.setText(String.valueOf(blueScore));
                break;
            case R.id.activity_main_button_plus_tiga_red:
                redScore = redScore + 3;
                tvRedScore.setText(String.valueOf(redScore));
                break;
            case R.id.activity_main_button_plus_tiga_blue:
                blueScore = blueScore + 3;
                tvBlueScore.setText(String.valueOf(blueScore));
                break;
            case R.id.activity_main_button_minus_nollima_red:
                redFoul = redFoul + .5;

                if (String.valueOf(redFoul - 0.5).endsWith(".5")){
                    blueScore++;
                }
                if (redFoul>=5){
                    Toast.makeText(this,"Pemenangnya sisi Biru!",Toast.LENGTH_LONG).show();
                }
                tvRedFoul.setText("Foul "+redFoul);
                tvBlueScore.setText(String.valueOf(blueScore));
                break;
            case R.id.activity_main_button_minus_nollima_blue:
                blueFoul = blueFoul + .5;

                if (String.valueOf(blueFoul - 0.5).endsWith(".5")){
                    redScore++;
                }
                if (blueFoul>=5){
                    Toast.makeText(this,"Pemenangnya sisi Biru!",Toast.LENGTH_LONG).show();
                }
                tvBlueFoul.setText("Foul "+blueFoul);
                tvRedScore.setText(String.valueOf(redScore));
                break;
            case R.id.activity_main_button_minus_satu_red:
                redScore = redScore -1;
                tvRedScore.setText(String.valueOf(redScore));
                break;
            case R.id.activity_main_button_minus_satu_blue:
                blueScore = blueScore - 1;
                tvBlueScore.setText(String.valueOf(blueScore));
                break;
            case R.id.activity_main_button_reset:
                redFoul=0;
                blueFoul =0;




        }
    }
}
