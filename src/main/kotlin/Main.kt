fun main() {
    val taskService = TaskService()
    // Создание задачи
    val task1 = taskService.createTask("Задача 1", " Описание первой задачи")
    val task2 = taskService.createTask("Задача 2", "Описание второй задачи")

    //вывод задач
    println("Все задачи:")
    taskService.getAllTasks().forEach{ println(it) }

    //получение задачи по ID
    val taskIdToFind = 1
    val foundTask = taskService.getTaskById(taskIdToFind)
    println("\nНайденная задача с ID $taskIdToFind:")
    println(foundTask)

    //Обновление задачи
    foundTask?.let {
        it.title = "Новое назначение задачи"
        it.description = "Новое описание задачи"
        taskService.updateTask(it)
        println("\nОбновленная задача:")
        println(it)
    }

    //Удаление задачи
    val taskIdToDelete = 2
    val isDeleted = taskService.deleteTask(taskIdToDelete)
    if(isDeleted){
        println("\nЗадача с ID $taskIdToDelete удалена.")
    } else {
        println("\nЗадача с ID $taskIdToDelete не найдена.")
    }

    // Вывод всех задач после операции CRUD
    println("\nВсе задачи после операции:")
    taskService.getAllTasks().forEach{ println(it) }
}