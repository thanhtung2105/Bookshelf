package com.example.bookshelf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
   Context context;
   ArrayList<BookModel> bookList;
   onClick_comicItem onClick_comicItem;
    public interface onClick_comicItem{
        void onClick(BookModel bookModel);
    }

    public BookAdapter(Context context, ArrayList<BookModel> bookList, onClick_comicItem onClick_comicItem) {
        this.context = context;
        this.bookList = bookList;
        this.onClick_comicItem = onClick_comicItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.book_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final BookModel bookModel=bookList.get(position);
        holder.book_name.setText(bookModel.book_name);
        holder.book_img.setImageResource(bookModel.book_img);
        holder.book_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick_comicItem.onClick(bookModel);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView book_img;
        TextView book_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            book_img = itemView.findViewById(R.id.book_img);
            book_name = itemView.findViewById(R.id.book_name);
        }
    }

}
