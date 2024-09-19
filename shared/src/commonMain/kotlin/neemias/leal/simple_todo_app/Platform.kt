package neemias.leal.simple_todo_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform