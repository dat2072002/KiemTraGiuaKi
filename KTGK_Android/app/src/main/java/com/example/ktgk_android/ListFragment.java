package com.example.ktgk_android;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListFragment extends androidx.fragment.app.ListFragment {

    ArrayList<SinhVien> arraySinhVien;
    StudentAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        arraySinhVien = new ArrayList<>();
        AddArraySV();
        adapter = new StudentAdapter(getActivity(),R.layout.row_student, arraySinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_list, container, false);
    };

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Fragment secondfrag = new StudentFragmentInfo();
        FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
        fm.replace(R.id.container,secondfrag).commit();

    }

    private void AddArraySV(){
        arraySinhVien.add(new SinhVien("Pham Duy Dat", 2002,"Phu Yen","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Dao Chung Thuy", 2002,"Quang Binh","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Phan Thi Hoai Anh", 2002,"Binh Dinh","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyen Huynh Tung Chau", 2002,"Khanh Hoa","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Dao Van Lanh", 2002,"Ha Noi","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Le Van Tan", 2002,"Ha Noi","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyen Trong Hai", 2002,"Gia Lai","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Tran Van Quoc", 2002,"Gia Lai","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Ngo Thien Truc", 2002,"Quang Nam","nva@gmail.com"));
        arraySinhVien.add(new SinhVien("Dang Pham Anh Tuan", 2002,"Phu Yen","nva@gmail.com"));
    }
}