package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActBodyPart extends AppCompatActivity {
    private ListView lista;
    private String BodyParts[]=new String[]{"Mouth","Arm","Hand","Nose","Eye","Foot","Leg"};
    private Integer[] imgid={
            R.drawable.boca,
            R.drawable.brazo,
            R.drawable.mano,
            R.drawable.nariz,
            R.drawable.ojo,
            R.drawable.pie,
            R.drawable.pierna

    };

    MediaPlayer bo,br,ma,na,oj,pi,pie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_body_part);
        bo = MediaPlayer.create(this,R.raw.boca);
        br = MediaPlayer.create(this,R.raw.brazo);
        ma = MediaPlayer.create(this,R.raw.mano);
        na = MediaPlayer.create(this,R.raw.nariz);
        oj = MediaPlayer.create(this,R.raw.ojo);
        pi = MediaPlayer.create(this,R.raw.pie);
        pie = MediaPlayer.create(this,R.raw.pierna);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,BodyParts,imgid);
        lista=(ListView)findViewById(R.id.lstBodyPart);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    bo.start();
                }else if (position == 1){

                    br.start();
                }else if (position == 2){

                    ma.start();
                }else if (position == 3){

                    na.start();
                }else if (position == 4) {

                    oj.start();
                }
                else if (position == 4) {

                    pi.start();
                }
                else if (position == 4) {

                    pie.start();
                }
            }
        });
    }
}
