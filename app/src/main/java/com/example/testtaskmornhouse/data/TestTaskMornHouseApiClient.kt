package com.example.testtaskmornhouse.data

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Inject

class TestTaskMornHouseApiClient @Inject constructor(){
    val testTaskMornHouseApiClient = Retrofit.Builder()
        .baseUrl("http://numbersapi.com/")
        .addConverterFactory( ScalarsConverterFactory.create())
        .build()
}
