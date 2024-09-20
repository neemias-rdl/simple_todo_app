package neemias.leal.simple_todo_app.android.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import neemias.leal.simple_todo_app.android.navigation.NavRoutes

@Composable
fun HomePage(navHostController: NavHostController) {
    Surface (
        modifier = Modifier.fillMaxSize(),
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("I am in the home page")
            Divider()
            Button(onClick = {
                navHostController.navigate(NavRoutes.TASK_LIST.name)
            },
                ) {
                Text("Task List")
            }
        }
    }
}