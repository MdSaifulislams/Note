package com.example.note;

import static com.example.note.R.drawable.saiful3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class note_adapter extends RecyclerView.Adapter<user_view_holder> {

   ArrayList<country_data> array_list;
   Context use_class_context;

String name;



   public note_adapter(ArrayList<country_data> array_list , Context use_class_context) {
      this.array_list = array_list;
      this.use_class_context = use_class_context;
   }


   @NonNull
   @Override
   public user_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

	   View view = LayoutInflater.from(use_class_context).inflate(R.layout.show_layout_design,parent,false);

      user_view_holder user_view_holder = new user_view_holder(view);
      return user_view_holder;
   }




   @Override
   public void onBindViewHolder(@NonNull user_view_holder holder, int position) {

      name = array_list.get(position).getCountry_name();
		  holder.show_layout_data.setText(name);


      Picasso.get().load(array_list.get(position).getCountry_flag()).into(holder.profile_photo);

   }



@Override
   public int getItemCount() {
      return array_list.size();
   }
}
