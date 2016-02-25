package com.ascendcorparation.what_if;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class score extends AppCompatActivity {
    protected Button bt;
    TextView tv2, tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        bt = (Button) findViewById(R.id.bt);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        int score = getIntent().getExtras().getInt("score", 13);
        bt.setText(String.valueOf(score));


        if (score >= 0 && score < 4) {
            tv3.setText("Low result. You should practise more!");
            tv2.setText("Beginner");
        } else {
            if (score >= 4 && score < 6) {
                tv3.setText("Keep going! You are in a right direction!");
                tv2.setText("Beginner");
            } else {
                if (score >= 6 && score < 8) {
                    tv3.setText("You have nice potential!");
                    tv2.setText("Amateur");
                } else {
                    if (score >= 8 && score < 10) {
                        tv3.setText("Thar's average result. You can't be in the middle!:)");
                        tv2.setText("Amateur");
                    } else {
                        if (score >= 10 && score < 12) {
                            tv3.setText("CoOoOl! We are proud of you.");
                            tv2.setText("Professional");
                        } else {
                            if (score >= 12 && score < 14) {
                                tv3.setText("Look at you! So intelligent! Keep going:)");
                                tv2.setText("Professional");
                            } else {
                                if (score >= 14 && score < 17) {
                                    tv3.setText("Are not you Steve Jobs?! You are amazing!");
                                    tv2.setText("Professional");
                                } else {
                                    if (score >= 17 && score < 19) {
                                        tv3.setText("You are definitely genuine! Keep going!");
                                        tv2.setText("Master");
                                    } else {
                                        if (score >= 19 && score < 21) {
                                            tv3.setText("HOW ARE YOU DOING THIS? Are not you a computer?:)");
                                            tv2.setText("Master");
                                        } else {
                                            if (score >= 21) {
                                                tv3.setText("You are probably part of 10% of smartest people in the world!");
                                                tv2.setText("Expert");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        Button vk = (Button) findViewById(R.id.vk);
        vk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "What if?");
                    String sAux = "\nLet me recommend you this application\n\n";
                    sAux = sAux + "https://play.google.com/store/apps/details?id=Orion.S.. \n\n";
                    i.putExtra(Intent.EXTRA_TEXT, sAux);
                    startActivity(Intent.createChooser(i, "choose one"));
                } catch (Exception e) { //e.toString();
                }

            }
        });


        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });

    }

}

