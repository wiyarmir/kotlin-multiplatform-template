package org.example.kotlin.multiplatform.di

import org.example.kotlin.multiplatform.data.NetworkDataSource
import org.example.kotlin.multiplatform.presenter.HelloPresenter
import org.example.kotlin.multiplatform.presenter.HelloView
import org.example.kotlin.multiplatform.repository.NetworkRepository
import org.example.kotlin.multiplatform.usecase.GetHello

class NotDagger {
    private val dataSource = NetworkDataSource()
    val repository: NetworkRepository by lazy { NetworkRepository(dataSource = dataSource) }

    private fun getUserProfile() = GetHello(repository)

    fun helloPresenter(view: HelloView): HelloPresenter = HelloPresenter(view, getUserProfile())
}
