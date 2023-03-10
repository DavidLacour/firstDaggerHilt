package com.example.firstdagger3

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
 class MyModule {
    @Singleton
    @Provides
    fun provideApi(): Api{
        return  MyApi()
    }
}