package com.example.yemeksepeti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.yemeksepeti.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL ));

        ArrayList<Resimler> resimlerlistesi = new ArrayList<>();
        Resimler f1 = new Resimler("algida",1);
        Resimler f2 = new Resimler("burger",2);
        Resimler f3 = new Resimler("coca_cola",3);
        Resimler f4 = new Resimler("pasaport",4);

        resimlerlistesi.add(f1);
        resimlerlistesi.add(f2);
        resimlerlistesi.add(f3);
        resimlerlistesi.add(f4);

        Adapter adapter = new Adapter(this,resimlerlistesi);
        binding.rv.setAdapter(adapter);

        binding.rv2.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<Resimler2> resimler2s = new ArrayList<>();
        Resimler2 a1 = new Resimler2(1,"lezzet","Lezz-et Sarayı","₺ Kebap & Türk Mutfağı,Pide"
                ,"120,00 TL min. sepet tutarı",8.1," (32)");
        Resimler2 a2 = new Resimler2(2,"kebap","Özdağlar Kebap","₺₺ Kebap & Türk Mutfağı,Restoran"
                ,"50,00 TL min. sepet tutarı",9.0," (100+)");
        Resimler2 a3 = new Resimler2(3,"pastane2","Kemal Pastanesi","₺ Pastane & Fırın,Tatlı,Restoran"
                ,"30,00 TL min. sepet tutarı",8.6," (53)");
        Resimler2 a4 = new Resimler2(4,"hpizza","Pizza Taxi","₺ Pizza,Restoran Teslimatlı"
                ,"50,00 TL min. sepet tutarı",8," (100+)");
        Resimler2 a5 = new Resimler2(5,"gurme","Gurme","₺₺ Tost & Sandviç,Kahvaltı & Börek"
                ,"70,00 TL min. sepet tutarı",8.4," (1000+)");


        resimler2s.add(a1);
        resimler2s.add(a2);
        resimler2s.add(a3);
        resimler2s.add(a4);
        resimler2s.add(a5);

        Adapter2 adapter2 = new Adapter2(this,resimler2s);
        binding.rv2.setAdapter(adapter2);














    }



}