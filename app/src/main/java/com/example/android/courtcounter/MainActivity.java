package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseScore(View view){
        String team = null;
        int score = 0;

        switch(view.getId()){
            case R.id.team_a_try:
                team = "A";
                score = 5;
                break;

            case R.id.team_a_conversion:
                team = "A";
                score = 2;
                break;

            case R.id.team_a_penalty:
                team = "A";
                score = 3;
                break;


            case R.id.team_a_drop_goal:
                team = "A";
                score = 3;
                break;


            case R.id.team_b_try:
                team = "B";
                score = 5;
                break;


            case R.id.team_b_conversion:
                team = "B";
                score = 2;
                break;


            case R.id.team_b_penalty:
                team = "B";
                score = 3;
                break;


            case R.id.team_b_drop_goal:
                team = "B";
                score = 3;
                break;

        }


        addToScoreCounter(team, score);
    }

    private void addToScoreCounter(String team, int score){
        TextView scoreView;

        if (team.equals("A")) {
            scoreTeamA += score;
        } else {
            scoreTeamB += score;
        }

        updateScores();

    }

    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;

        updateScores();
    }

    private void updateScores(){
        TextView teamAScoreText = findViewById(R.id.team_a_score);
        teamAScoreText.setText(Integer.toString(scoreTeamA));

        TextView teamBScoreText = findViewById(R.id.team_b_score);
        teamBScoreText.setText(Integer.toString(scoreTeamB));
    }
}
