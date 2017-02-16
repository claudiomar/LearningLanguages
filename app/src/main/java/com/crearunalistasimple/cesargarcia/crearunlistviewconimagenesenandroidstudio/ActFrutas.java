package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import static android.app.PendingIntent.getActivity;

public class ActFrutas extends AppCompatActivity {
    private ListView lista;
    private String Fruts[]=new String[]{"Apple","Grape","Banana","Orange","Pear"};
    private Integer[] imgid={
            R.drawable.manzana_pres,
            R.drawable.grapes_pres,
            R.drawable.platano,
            R.drawable.naranja,
            R.drawable.pera

    };
    MediaPlayer app,grap,ba,or,pe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_frutas);
         app = MediaPlayer.create(this,R.raw.apple);
        grap = MediaPlayer.create(this,R.raw.grapes);
        ba = MediaPlayer.create(this,R.raw.banana);
        or = MediaPlayer.create(this,R.raw.orange);
        pe = MediaPlayer.create(this, R.raw.pera);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,Fruts,imgid);
        lista=(ListView)findViewById(R.id.lstFrutas);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                   app.start();
                }else if (position == 1){

                    grap.start();
                }else if (position == 2){

                    ba.start();
                }else if (position == 3){

                    or.start();
                }else if (position == 4) {

                    pe.start();
                }
            }
        });

    }


}
