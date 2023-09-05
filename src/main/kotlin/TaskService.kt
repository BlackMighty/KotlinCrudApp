class TaskService {

    private val  tasks = mutableListOf<Task>()

    fun createTask(title: String, description: String): Task{
        val newId = tasks.size +1
        val task = Task(newId, title, description)
        tasks.add(task)
        return task

    }

    fun getTaskById(id: Int): Task?{
        return tasks.find { it.id == id }
    }

    fun getAllTasks(): List<Task>{
        return tasks.toList()
    }

    fun updateTask(task: Task): Task?{
        val existingTask = tasks.find {it.id == task.id}
        if(existingTask != null) {
            existingTask.title = task.title
            existingTask.description = task.description
        }
        return existingTask
        }

    fun deleteTask(id: Int): Boolean{
        val task = tasks.find {it.id == id}
        if(task != null){
            tasks.remove(task)
            return true
        }
        return false
    }
    }
