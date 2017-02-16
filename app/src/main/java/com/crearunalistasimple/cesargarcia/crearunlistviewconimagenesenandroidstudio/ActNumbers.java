package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActNumbers extends AppCompatActivity {
    private ListView lista;
    private String Numbers[]=new String[]{"One","Two","Three","Four","Five"};
    private Integer[] imgid={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five
            /*
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten
            */

    };
    MediaPlayer one,two,three,four,five,six,seven,eight,nine,ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_numbers);

        one = MediaPlayer.create(this,R.raw.one);
        two = MediaPlayer.create(this,R.raw.two);
        three = MediaPlayer.create(this,R.raw.three);
        four = MediaPlayer.create(this,R.raw.four);
        five = MediaPlayer.create(this,R.raw.five);
        /*
        six = MediaPlayer.create(this,R.raw.six);
        seven = MediaPlayer.create(this,R.raw.seven);
        eight = MediaPlayer.create(this,R.raw.eight);
        nine = MediaPlayer.create(this,R.raw.nine);
        ten = MediaPlayer.create(this,R.raw.ten);
       */
        LenguajeListAdapter adapter=new LenguajeListAdapter(this,Numbers,imgid);
        lista=(ListView)findViewById(R.id.lstNumbers);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    one.start();
                }else if (position == 1){

                    two.start();
                }else if (position == 2){

                    three.start();
                }else if (position == 3){

                    four.start();
                }else if (position == 4) {

                    five.start();
                }/*
                else if (position == 5) {

                    six.start();
                }
                else if (position == 6) {

                    seven.start();
                }
                else if (position == 7) {

                    eight.start();
                }
                else if (position == 8) {

                    nine.start();
                }
                else if (position == 9) {

                    ten.start();
                }
                */
            }
        });
    }
}
