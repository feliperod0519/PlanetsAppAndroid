package com.feliperodcoding.planetsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Planet> planetsArrayList;
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        planetsArrayList = new ArrayList<>();

        planetsArrayList.add(new Planet("Mercury","0 Moons",R.drawable.mercury));
        planetsArrayList.add(new Planet("Venus", "0 Moons", R.drawable.venus));
        planetsArrayList.add(new Planet("Earth","1",R.drawable.earth));
        planetsArrayList.add(new Planet("Mars", "2 Moons", R.drawable.mars));
        planetsArrayList.add(new Planet("Jupiter", "79 Moons", R.drawable.jupiter));
        planetsArrayList.add(new Planet("Saturn", "83 Moons", R.drawable.saturn));
        planetsArrayList.add(new Planet("Uranus", "27 Moons", R.drawable.uranus));
        planetsArrayList.add(new Planet("Neptune", "14 Moons", R.drawable.neptune));

        adapter = new MyCustomAdapter(getApplicationContext(),planetsArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Planet name:" + adapter.getItem(i).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}