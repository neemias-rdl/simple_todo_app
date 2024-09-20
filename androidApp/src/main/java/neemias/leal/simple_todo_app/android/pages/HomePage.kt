package neemias.leal.simple_todo_app.android.pages

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomePage(navHostController: NavHostController) {
    Surface {
        Text("I am in the home page")
    }
}