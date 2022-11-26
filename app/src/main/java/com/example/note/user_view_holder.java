package com.example.note;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class user_view_holder extends RecyclerView.ViewHolder {

   TextView show_layout_data ;
   TextView first_title ;
   ImageView profile_photo;


   public user_view_holder(@NonNull View itemView) {
      super(itemView);


      show_layout_data = itemView.findViewById(R.id.show_data);
      profile_photo =itemView.findViewById(R.id.profile_photo);

   }

}
