package neemias.leal.simple_todo_app.android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import neemias.leal.simple_todo_app.android.pages.HomePage
import neemias.leal.simple_todo_app.android.pages.TaskListPage
import androidx.navigation.compose.composable

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination =  NavRoutes.HOME.name,
    ) {
        composable(route = NavRoutes.HOME.name) {
            HomePage(navController)
        }
        composable(route = NavRoutes.TASK_LIST.name) {
            TaskListPage(navController)
        }
    }
}

