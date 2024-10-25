package br.com.etecia.floricultura;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Flores> lstFlores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstFlores = new ArrayList<>();
        lstFlores.add(
                new Flores("Rosa", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Kalanchoê", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Hibisco", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Girassol", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Íris", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Hortênsia", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Gerânio", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Gérbera", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Cravo", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Ciclame", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Cineraria", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Camelia", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Calêndula", R.drawable.rosa)
        );lstFlores.add(
                new Flores("Antúrio", R.drawable.rosa)
        );

        recyclerView = findViewById(R.id.idRecFlores);

        Adaptador adaptador = new Adaptador(getApplicationContext(), lstFlores);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        recyclerView.hasFixedSize();

        recyclerView.setAdapter(adaptador);

    }
}