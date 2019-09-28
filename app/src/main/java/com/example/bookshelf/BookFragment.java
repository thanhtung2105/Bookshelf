package com.example.bookshelf;


import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragment extends Fragment {
    BookModel bookModel;

    public BookFragment(BookModel bookModel) {
        // Required empty public constructor
        this.bookModel = bookModel;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_book, container, false);
        TextView content = view.findViewById(R.id.comic_content);
        ImageView image = view.findViewById(R.id.comic_image);
        content.setText(bookModel.book_name);
        image.setImageResource(bookModel.book_img);
        return view;
    }
}