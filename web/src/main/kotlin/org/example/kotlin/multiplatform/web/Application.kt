package org.example.kotlin.multiplatform.web

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.html.js.onClickFunction
import org.example.kotlin.multiplatform.repository.NetworkRepository
import react.RBuilder
import react.RComponent
import react.RHandler
import react.RProps
import react.RState
import react.child
import react.dom.button
import react.dom.div
import react.dom.h3
import react.dom.p
import react.functionalComponent
import react.useState

class Application : RComponent<ApplicationProps, RState>() {

    override fun RBuilder.render() {
        div(classes = "container") {
            div(classes = "header clearfix") {
                h3 { +"Kotlin Multiplatform Example" }
            }
            child(hello(), props = props)
        }
    }
}

fun hello() = functionalComponent<ApplicationProps> { props ->
    val (name, setName) = useState(null as String?)

    div {
        p { +if (name == null) "Hello" else "Hello, $name" }
        button(classes = "btn btn-primary") {
            +"Fetch"
            attrs {
                onClickFunction = {
                    GlobalScope.launch {
                        console.log(props)
                        val name = props.networkRepository.getGreeting("web")
                        setName(name.message)
                    }
                }
            }
        }
    }
}

external interface ApplicationProps : RProps {
    var networkRepository: NetworkRepository
}

fun RBuilder.app(handler: RHandler<ApplicationProps>) = child(Application::class, handler)
