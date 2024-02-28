package com.example.testtaskmornhouse.data

import com.example.testtaskmornhouse.domain.GetTestTaskMornHouseRepository

class GetTestTaskMornHouseRepositoryImpl(apiClient:TestTaskMornHouseApiClient):GetTestTaskMornHouseRepository {
    private val apiInterface =
        apiClient.testTaskMornHouseApiClient.create(TestTaskMornHouseApiInterface::class.java)

    override suspend fun getFactAboutNumber(number: String):String =
        apiInterface.getFactAboutNumber(number)
}
