package com.example.a.health_assistant.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a.health_assistant.R;

public class SecondFragment extends Fragment {

//    private String content;
//    public MyTwoFragment(String content) {
//        this.content = content;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_remind,container,false);
//        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
//        txt_content.setText(content);
        return view;
    }
}
