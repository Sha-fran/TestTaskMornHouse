package com.example.testtaskmornhouse.domain

interface GetTestTaskMornHouseRepository {
    suspend fun getFactAboutNumber(number: String): String
}
