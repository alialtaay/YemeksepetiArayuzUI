package com.example.yemeksepeti;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PixelFormat;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemeksepeti.databinding.CardTasarimBinding;

import java.util.List;

public class Adapter extends  RecyclerView.Adapter<Adapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Resimler> resimlerlistesi;

    public Adapter(Context mContext, List<Resimler> resimlerlistesi) {
        this.mContext = mContext;
        this.resimlerlistesi = resimlerlistesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

        Resimler resim = resimlerlistesi.get(position);
        CardTasarimBinding t = holder.binding;
        t.cardResim.setImageResource(mContext.getResources()
                .getIdentifier(resim.getResimAd(),"drawable",mContext.getPackageName()));




    }

    @Override
    public int getItemCount() {
        return resimlerlistesi.size();
    }

    public class  CardTasarimTutucu extends  RecyclerView.ViewHolder{
        private CardTasarimBinding binding;
        public  CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }




}
