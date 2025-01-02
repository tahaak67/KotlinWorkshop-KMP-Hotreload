package ly.com.tahaben.kotlinworkshop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.compose.reload.DevelopmentEntryPoint

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kotlin Workshop",
    ) {
        DevelopmentEntryPoint {
            App()
        }
    }
}