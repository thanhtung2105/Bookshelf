package com.example.bookshelf;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements BookAdapter.onClick_comicItem {
RecyclerView recyclerView;
ArrayList<BookModel> bookList;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView=view.findViewById(R.id.recycler_view);

        bookList = new ArrayList();
        bookList.add(new BookModel(R.drawable.comic_1," Naruto Vol.1   Uzumaki Naruto"));
        bookList.add(new BookModel(R.drawable.comic_2," Naruto Vol.2   Vị khách khó ưa"));
        bookList.add(new BookModel(R.drawable.comic_3," Naruto Vol.3   Ước mơ !!!"));
        bookList.add(new BookModel(R.drawable.comic_4," Naruto Vol.4   Cây cầu mang tên người anh hùng !!"));
        bookList.add(new BookModel(R.drawable.comic_5," Naruto Vol.5   Đấu thủ !!"));
        bookList.add(new BookModel(R.drawable.comic_6," Naruto Vol.6   Quyết tâm của Sakura !!"));
        bookList.add(new BookModel(R.drawable.comic_7," Naruto Vol.7   Con đường duy nhất...!!"));
        bookList.add(new BookModel(R.drawable.comic_8," Naruto Vol.8   Trận chiến sống còn!!"));
        bookList.add(new BookModel(R.drawable.comic_9," Naruto Vol.9   Neji và Hinata"));
        bookList.add(new BookModel(R.drawable.comic_1," Naruto Vol.1   Uzumaki Naruto"));
        bookList.add(new BookModel(R.drawable.comic_2," Naruto Vol.2   Vị khách khó ưa"));
        bookList.add(new BookModel(R.drawable.comic_3," Naruto Vol.3   Ước mơ !!!"));
        bookList.add(new BookModel(R.drawable.comic_4," Naruto Vol.4   Cây cầu mang tên người anh hùng !!"));
        bookList.add(new BookModel(R.drawable.comic_5," Naruto Vol.5   Đấu thủ !!"));
        bookList.add(new BookModel(R.drawable.comic_6," Naruto Vol.6   Quyết tâm của Sakura !!"));
        bookList.add(new BookModel(R.drawable.comic_7," Naruto Vol.7   Con đường duy nhất...!!"));
        bookList.add(new BookModel(R.drawable.comic_8," Naruto Vol.8   Trận chiến sống còn!!"));
        bookList.add(new BookModel(R.drawable.comic_9," Naruto Vol.9   Neji và Hinata"));

        BookAdapter bookAdapter=new BookAdapter(getContext(),bookList,this);
        recyclerView.setAdapter(bookAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        return view;
    }

    @Override
    public void onClick(BookModel bookModel) {
        getFragmentManager().beginTransaction().replace(R.id.main_container,new BookFragment(bookModel)).addToBackStack(null).commit();
    }
}
