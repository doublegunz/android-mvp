package com.gungunpriatna.simplemvpapps.home;

import com.gungunpriatna.simplemvpapps.models.CityListResponse;

public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getCityListSuccess(CityListResponse cityListResponse);
}
