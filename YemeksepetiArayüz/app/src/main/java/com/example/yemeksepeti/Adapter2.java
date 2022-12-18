package com.example.yemeksepeti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemeksepeti.databinding.CardTasarim2Binding;
import com.example.yemeksepeti.databinding.CardTasarimBinding;

import java.util.ArrayList;
import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.CardTasarim2Tutucu> {

    private Context mContext;
    private List<Resimler2> resimler2s;


    public Adapter2(Context mContext, List<Resimler2> resimler2s) {
        this.mContext = mContext;
        this.resimler2s = resimler2s;
    }

    @NonNull
    @Override
    public CardTasarim2Tutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarim2Binding binding = CardTasarim2Binding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarim2Tutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarim2Tutucu holder, int position) {
        Resimler2 resim2 = resimler2s.get(position);
        CardTasarim2Binding a = holder.binding;
        a.cardResim2.setImageResource(mContext.getResources().getIdentifier(resim2.getResimad(),"drawable",mContext
                .getPackageName()));
        a.tV1.setText(resim2.gettV1());
        a.tV2.setText(resim2.gettV2());
        a.tV3.setText(resim2.gettV3());
        a.tV4.setText(resim2.gettV4());
        a.tV5.setText(String.valueOf(resim2.gettV5()));



    }

    @Override
    public int getItemCount() {
        return resimler2s.size();
    }


    public class CardTasarim2Tutucu extends RecyclerView.ViewHolder{
        private CardTasarim2Binding binding;
        public CardTasarim2Tutucu(CardTasarim2Binding binding){
            super(binding.getRoot());
            this.binding = binding;

        }
    }


}

