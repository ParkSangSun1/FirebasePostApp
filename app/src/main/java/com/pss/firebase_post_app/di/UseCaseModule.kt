package com.pss.firebase_post_app.di

import com.pss.domain.repository.MainRepository
import com.pss.domain.usecase.TestUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideTestUseCase(repository: MainRepository) = TestUseCase(repository)

}