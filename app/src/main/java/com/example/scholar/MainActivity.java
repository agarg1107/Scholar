package com.example.scholar;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    public int per;
    ArrayList<String> maincollage = new ArrayList<String>(){{add("GLA");add("BIT");add("MIT");add("IIT");add("NIT");add("MANIPAL");add("GOINKA");add("GOKUL");add("OXFARD");add("GFIT");}};
    ArrayList<String> pack = new ArrayList<String>(){{add("10000");add("40000");add("20000");add("50000");add("150000");add("80000");add("100000");add("400000");add("15400");add("42000");}};
    ArrayList<Integer> percent = new ArrayList<Integer>(){{add(90);add(85);add(99);add(92);add(70);add(65);add(45);add(82);add(75);add(85);}};
    ArrayList<String> collage = new ArrayList<>();
    ArrayList<String> packagelist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit);
        button = findViewById(R.id.submit);

        button.setOnClickListener(view -> {
            per = Integer.parseInt(editText.getText().toString());
            for(int i =0 ; i<percent.size();i++){
                if(per <= 100){
                if(per >= percent.get(i) ) {
                    collage.add(maincollage.get(i));
                    packagelist.add(pack.get(i));
                }
            }}

            Intent intent = new Intent(MainActivity.this,list.class);
            intent.putExtra("collagelist",collage);
            intent.putExtra("packlist",packagelist);
            startActivity(intent);
            collage.clear();
            packagelist.clear();
        });
    }

}