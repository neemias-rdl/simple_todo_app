package neemias.leal.simple_todo_app

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "App running on: ${platform.name}"
    }
}