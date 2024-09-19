package neemias.leal.simple_todo_app

fun genMockTasks() : MutableList<TaskModel> {
    return mutableListOf(
        TaskModel("Task 1", "Description 1", false),
        TaskModel("Task 2", "Description 2", false),
        TaskModel("Task 3", "Description 3", false),
    )
}