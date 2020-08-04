package com.shehrozkamran.sliderandzoom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.List;

public class SliderAdrapter extends RecyclerView.Adapter<SliderAdrapter.SliderViewHolder>{

    private List<SliderItem> sliderItems;
    private int pos;

    SliderAdrapter(List<SliderItem> sliderItems, int pos) {

        this.sliderItems = sliderItems;
        this.pos =pos;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slider_item_container,
                        parent,
                        false)

        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
   //     position = pos;
        holder.setimage(sliderItems.get(position));
    }

    @Override
    public int getItemCount() {
        return sliderItems.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder{
        private PhotoView imageView;
        private TextView textView;


        SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.photoview);

            textView = itemView.findViewById(R.id.textView);

        }

        void setimage(SliderItem sliderItem)
        {
            try{
                textView.setText(sliderItem.getText());
                imageView.setImageResource(sliderItem.getImage());
            }
            catch (Exception e)
            {
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
            }

        }
    }
}
