import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import kotlinx.coroutines.MainScope
import ru.otus.tictactoe.shared.GameModel
import ru.otus.tictactoe.shared.ui.GameScreen

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val viewModel = GameModel(MainScope())

    CanvasBasedWindow(canvasElementId = "ComposeTarget") {

        val viewState by viewModel.state.collectAsState()
        GameScreen(
            gameState = viewState,
            onCellClick = { viewModel.processCellClick(it) },
            onRestart = { viewModel.restart() }
        )
    }
}