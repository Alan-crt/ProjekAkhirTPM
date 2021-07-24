package com.example.projectakhir.Service;

import com.example.projectakhir.HolidaysModel.HolidaysResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HolidaysRepository {
    @GET("v1/holidays?api_key=092a3a02-c144-400a-bd8d-ea4d75b61b08")
    Call<HolidaysResponse> getHoliday();
}
