package com.gungunpriatna.simplemvpapps.networking;

import com.gungunpriatna.simplemvpapps.models.CityListResponse;

import rx.Observable;

import retrofit2.http.GET;

public interface NetworkService {
    @GET("v1/city")
    Observable<CityListResponse> getCityList();
}
