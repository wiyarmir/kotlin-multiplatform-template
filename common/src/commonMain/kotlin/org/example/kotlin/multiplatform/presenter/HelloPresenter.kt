package org.example.kotlin.multiplatform.presenter

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import org.example.kotlin.multiplatform.coroutines.CustomMainScope
import org.example.kotlin.multiplatform.repository.model.Greeting
import org.example.kotlin.multiplatform.usecase.GetHello

class HelloPresenter(
    private val view: HelloView,
    private val getHello: GetHello,
    private val mainScope: CoroutineScope = CustomMainScope()
) : CoroutineScope by mainScope {

    private lateinit var _state: ProfileViewState
    private var state: ProfileViewState
        get() = _state
        set(value) = when (value) {
            is ProfileViewState.Loading -> view.showLoading()
            is ProfileViewState.Content -> view.showGreeting(value.greeting)
            is ProfileViewState.Error -> view.showError("Error: ${value.throwable.message}")
        }

    fun loadGreeting() {
        state = ProfileViewState.Loading
        launch {
            @Suppress("TooGenericExceptionCaught")
            try {
                val person = getHello.execute(currentPlatform)
                state = ProfileViewState.Content(person)
            } catch (error: Throwable) {
                state = ProfileViewState.Error(error)
            }
        }
    }

    fun destroy() = cancel()
}

expect val currentPlatform: String

interface HelloView {
    fun showGreeting(greeting: Greeting)
    fun showLoading()
    fun showError(error: String)
}

sealed class ProfileViewState {
    object Loading : ProfileViewState()
    data class Content(val greeting: Greeting) : ProfileViewState()
    data class Error(val throwable: Throwable) : ProfileViewState()
}
