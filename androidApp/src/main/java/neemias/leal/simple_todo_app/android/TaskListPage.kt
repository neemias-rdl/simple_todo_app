package neemias.leal.simple_todo_app.android

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import neemias.leal.simple_todo_app.TaskModel
import neemias.leal.simple_todo_app.genMockTasks


@Composable
fun TaskListPage(text: String) {
    // TODO: mudar mocks para dados reais
    val tasks = genMockTasks()

    Column(
        horizontalAlignment = Alignment.Start,
    ) {
        LazyColumn (
            modifier = Modifier
                .padding(5.dp)
        )
        {
            items(tasks.size) { index ->
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
        Spacer(modifier = Modifier.weight(1f))
        Divider()
        Text(text = text)
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

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        TaskListPage("App running on Android")
    }
}
