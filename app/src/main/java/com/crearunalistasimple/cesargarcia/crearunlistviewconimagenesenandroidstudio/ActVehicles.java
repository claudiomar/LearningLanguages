package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActVehicles extends AppCompatActivity {
    private ListView lista;
    private String Vehicles[]=new String[]{"Airplane","Ship","Car","Helicopter","Motorcycle","Train"};
    private Integer[] imgid={
            R.drawable.avion,
            R.drawable.barco,
            R.drawable.carro,
            R.drawable.helicoptero,
            R.drawable.moto,
            R.drawable.tren

    };
    MediaPlayer avi,bar,car,heli,mo,tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_vehicles);
        avi = MediaPlayer.create(this,R.raw.avion);
        bar = MediaPlayer.create(this,R.raw.barco);
        car = MediaPlayer.create(this,R.raw.carro);
        heli = MediaPlayer.create(this,R.raw.helicoptero);
        mo = MediaPlayer.create(this,R.raw.moto);
        tr = MediaPlayer.create(this,R.raw.tren);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,Vehicles,imgid);
        lista=(ListView)findViewById(R.id.lstVehicles);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    avi.start();
                }else if (position == 1){

                    bar.start();
                }else if (position == 2){

                    car.start();
                }else if (position == 3){

                    heli.start();
                }else if (position == 4) {

                    mo.start();
                }else if (position == 5) {
                    tr.start();
                }
            }
        });
    }
}
