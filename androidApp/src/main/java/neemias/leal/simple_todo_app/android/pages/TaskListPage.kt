package neemias.leal.simple_todo_app.android.pages

import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import neemias.leal.simple_todo_app.TaskModel
import neemias.leal.simple_todo_app.android.components.HeaderComponent
import neemias.leal.simple_todo_app.genMockTasks


@Composable
fun TaskListPage(navController: NavController) {
    // TODO: mudar mocks para dados reais
    val tasks = genMockTasks()
    Surface(
        color = MaterialTheme.colorScheme.surfaceVariant
    ) {
        LazyColumn ()
        {
            items(tasks.size) { index ->
                if (index == 0) {
                    HeaderComponent(heading = "Task List", navController = navController)
                }

                Spacer(modifier = Modifier.height(5.dp))

                val task = remember { mutableStateOf(tasks[index]) }
                TaskCard(
                    task.value,
                    onClick = {
                        task.value = task.value.copy(
                            isDone = !task.value.isDone
                        )
                    }
                )
            }
        }
    }
}

@Composable
fun TaskCard(task: TaskModel, onClick: () -> Unit) {
    Surface(
        onClick = onClick,
    ) {
        Row(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text(
                    text = task.title,
                    style = MaterialTheme.typography.bodyMedium,
                )
                Text(
                    text = task.description,
                    style = MaterialTheme.typography.bodySmall,
                )
            }
            RadioButton(
                selected = task.isDone,
                onClick = onClick
            )
        }
    }
}