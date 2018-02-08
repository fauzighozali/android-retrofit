package com.example.linustorvalds.retrofitapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Linus Torvalds on 3/30/2017.
 */

public interface MemberService {
    @GET("index.php/member")
    Call<List<Member>> getAllMembers();
}
