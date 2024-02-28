package com.example.testtaskmornhouse.data

import retrofit2.http.GET
import retrofit2.http.Path

interface TestTaskMornHouseApiInterface {
    @GET("{number}")
    suspend fun getFactAboutNumber(@Path("number") number: String):String
}
