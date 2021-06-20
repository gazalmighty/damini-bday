package com.example.damini_bday_navigation_drawer_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class newsAdapter extends RecyclerView.Adapter<newsAdapter.ContentView>{
//I have provided the ContentView. Check Video : https://youtu.be/2O7i4KglRuw

    Context context;
    ArrayList<Content> ContentArrayList;

    public newsAdapter(Context context, ArrayList<Content> contentArrayList) {
        this.context = context;
        ContentArrayList = contentArrayList;
    }

    @NonNull
    @NotNull
    @Override
    public newsAdapter.ContentView onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item,parent, false);
        return new ContentView(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull newsAdapter.ContentView holder, int position) {
    Content content  = ContentArrayList.get(position);
    holder.topic.setText(content.topic);
    holder.description.setText(content.description);
    holder.Author.setText(content.Author);
    holder.topic.setText(content.topic);
    }

    @Override
    public int getItemCount() {
        return ContentArrayList.size();
    }

    public static class ContentView extends RecyclerView.ViewHolder{
    TextView topic;
    TextView description;
    TextView Author;
    ImageView titleImage;
        public ContentView(@NonNull @NotNull View itemView) {
            super(itemView);
            topic = itemView.findViewById(R.id.textView_Title);
            description = itemView.findViewById(R.id.textView_Description);
            Author = itemView.findViewById(R.id.textView_author);
            titleImage = itemView.findViewById(R.id.imageView_description);


        }
    }
}
