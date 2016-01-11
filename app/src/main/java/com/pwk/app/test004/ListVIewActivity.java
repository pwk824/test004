package com.pwk.app.test004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListVIewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<String> babo = new ArrayList<>();
        babo.add("kimchi");
        babo.add("spaghetti");
        babo.add("steak");
        babo.add("dimsom");
        babo.add("rice");

        // ArrayAdapter를 이용해서 어댑터 생성
        ArrayAdapter<String> Adpater;
        Adpater = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,babo);

        // 어댑터를 이용하여 리스트뷰에 출력할 데이터 제공
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adpater);

    }
}
