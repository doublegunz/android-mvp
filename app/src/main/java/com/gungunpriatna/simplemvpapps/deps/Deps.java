package com.gungunpriatna.simplemvpapps.deps;

import com.gungunpriatna.simplemvpapps.home.HomeActivity;
import com.gungunpriatna.simplemvpapps.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}
