package com.example.linustorvalds.retrofitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private String url = "http://peron.hol.es/";
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Retrofit retrofit = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create()).build();

        MemberService service = retrofit.create(MemberService.class);

        Call<List<Member>> call = service.getAllMembers();

        call.enqueue(new Callback<List<Member>>() {
            @Override
            public void onResponse(Call<List<Member>> call, Response<List<Member>> response) {
                List<Member> data = response.body();

                String[] member = new String[data.size()];
                int i = 0;

                for (Member m : data){
                   member[i++] = m.getNama();
                }

                listView = (ListView) findViewById(R.id.listView);

                ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, member);

                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Member>> call, Throwable throwable) {

            }
        });
    }
}
