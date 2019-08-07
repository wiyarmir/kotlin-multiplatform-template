package org.example.kotlin.multiplatform.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import org.example.kotlin.multiplatform.presenter.HelloPresenter
import org.example.kotlin.multiplatform.presenter.HelloView
import org.example.kotlin.multiplatform.repository.model.Greeting

class HelloActivity : AppCompatActivity() {

    private val view: HelloView by lazy {
        object : HelloView {

            private val text: TextView = findViewById(R.id.text)
            private val button: Button = findViewById(R.id.button)

            init {
                button.setOnClickListener {
                    presenter.loadGreeting()
                }
            }

            override fun showGreeting(greeting: Greeting) {
                text.text = greeting.message
            }

            override fun showLoading() {
                Snackbar.make(findViewById(R.id.rootView), "Loading", Snackbar.LENGTH_SHORT).show()
            }

            override fun showError(error: String) {
                Snackbar.make(findViewById(R.id.rootView), error, Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    private lateinit var presenter: HelloPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        presenter = exampleApplication.notDagger.helloPresenter(view)
    }

    override fun onDestroy() {
        presenter.destroy()
        super.onDestroy()
    }
}
