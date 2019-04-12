package com.gwalior.android.zaika_e_gwalior;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv4 = (TextView)findViewById(R.id.textView4);
        tv5 = (TextView)findViewById(R.id.textView5);
        tv6 = (TextView)findViewById(R.id.textView6);
        tv7 = (TextView)findViewById(R.id.textView7);
        tv8 = (TextView)findViewById(R.id.textView8);
        tv9 = (TextView)findViewById(R.id.textView9);
        tv10 = (TextView)findViewById(R.id.textView10);
        tv11 = (TextView)findViewById(R.id.textView11);

        String str4 ="Food Attractions";
        String str5 ="Historical Attraction";
        String str6 ="Worship Attractions";
        String str7 ="Shopping Attractions";
        String str8 ="Nearby Places";
        String str9 ="Events of Gwalior";
        String str10 ="Gwalior Gharana";
        String str11 ="Key Numbers";
        tv4.setText(str4);
        tv5.setText(str5);
        tv6.setText(str6);
        tv7.setText(str7);
        tv8.setText(str8);
        tv9.setText(str9);
        tv10.setText(str10);
        tv11.setText(str11);

        CardView cardView = (CardView)findViewById(R.id.cardview1);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TODO.... pass the data
                //0
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);

                }


        }

        );
        CardView cardView1 = (CardView)findViewById(R.id.cardview2);

        cardView1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
//1
                                            Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
                                            startActivity(intent);

                                        }


                                    }

        );





    }
}