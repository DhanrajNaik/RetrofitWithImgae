package com.example.systems_5.retrofitwithimgae.network;

/**
 * Created by System S-5 on 14-07-2015.
 */
import android.test.suitebuilder.annotation.LargeTest;

//import com.makeinfo.retroflower.model.Flower;

import com.example.systems_5.retrofitwithimgae.model.Flower;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface api {

    @GET("/feeds/flowers.json")
    public void getData(Callback<List<Flower>> response);


}
