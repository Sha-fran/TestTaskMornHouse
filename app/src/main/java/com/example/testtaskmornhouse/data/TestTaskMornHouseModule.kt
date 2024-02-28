package com.example.testtaskmornhouse.data

import com.example.testtaskmornhouse.domain.GetTestTaskMornHouseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TestTaskMornHouseModule {
    @Singleton
    @Provides
    fun provideTestTaskMornHouseApiClient() = TestTaskMornHouseApiClient()

    @Singleton
    @Provides
    fun provideTestTaskMornHouseRepository(
        apiClient: TestTaskMornHouseApiClient
    ): GetTestTaskMornHouseRepository = GetTestTaskMornHouseRepositoryImpl(apiClient)
}
