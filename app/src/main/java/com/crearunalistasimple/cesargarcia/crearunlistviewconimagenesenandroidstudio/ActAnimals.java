package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActAnimals extends AppCompatActivity {

    private ListView lista;
    private String Animals[]=new String[]{"Fish","Cat","Dog","Cow","Lion"};
    private Integer[] imgid={
            R.drawable.goldfish,
            R.drawable.gato,
            R.drawable.dog,
            R.drawable.cow,
            R.drawable.lion

    };

    MediaPlayer fi,cat,dog,cow,lion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_animals);
        fi = MediaPlayer.create(this,R.raw.fish);
        cat = MediaPlayer.create(this,R.raw.cat);
        dog = MediaPlayer.create(this,R.raw.dog);
        cow = MediaPlayer.create(this,R.raw.cow);
        lion = MediaPlayer.create(this, R.raw.lion);
        LenguajeListAdapter adapter=new LenguajeListAdapter(this,Animals,imgid);
        lista=(ListView)findViewById(R.id.lstAnimals);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){


                    fi.start();
                }else if (position == 1){

                    cat.start();
                }else if (position == 2){

                    dog.start();
                }else if (position == 3){

                    cow.start();
                }else if (position == 4) {

                    lion.start();
                }
            }
        });


    }
}
