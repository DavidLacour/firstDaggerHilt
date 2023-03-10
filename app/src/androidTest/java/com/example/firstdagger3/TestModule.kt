package com.example.firstdagger3

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn( components = [SingletonComponent::class],
    replaces = [MyModule::class])
 class TestModule {
    @Singleton
    @Provides
    fun provideApi(): Api{
        return  TestApi()
    }

}