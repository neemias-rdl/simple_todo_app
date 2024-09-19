package neemias.leal.simple_todo_app

class TaskModel (title: String, description: String, isDone: Boolean) {
    var title: String = title
    var description: String = description
    var isDone: Boolean = isDone

    fun copy(
        title: String = this.title,
        description: String = this.description,
        isDone: Boolean = this.isDone
    ) = TaskModel(
        title,
        description,
        isDone,
    )
}