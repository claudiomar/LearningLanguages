package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActFamily extends AppCompatActivity {
    private ListView lista;
    private String Family[]=new String[]{"Mother","Father","Grandmother","Grandfather","Brother","Sister"};
    private Integer[] imgid={
            R.drawable.mother,
            R.drawable.father,
            R.drawable.grandmother,
            R.drawable.grandfather,
            R.drawable.brother,
            R.drawable.sister
    };

    MediaPlayer ma,pa,abuela,abuelo,bro,sis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_family);

        ma = MediaPlayer.create(this,R.raw.mama);
        pa = MediaPlayer.create(this,R.raw.papa);
        abuela = MediaPlayer.create(this,R.raw.abuela);
        abuelo = MediaPlayer.create(this,R.raw.abuelo);
        bro = MediaPlayer.create(this,R.raw.hermano);
        sis = MediaPlayer.create(this,R.raw.hermana);






        LenguajeListAdapter adapter=new LenguajeListAdapter(this,Family,imgid);
        lista=(ListView)findViewById(R.id.lstFamily);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    ma.start();
                }else if (position == 1){

                    pa.start();
                }else if (position == 2){

                    abuela.start();
                }else if (position == 3){

                    abuelo.start();
                }else if (position == 4) {

                    bro.start();
                }else if (position == 5) {

                    sis.start();
                }
            }
        });
    }
}
