package com.example.todo

import android.app.Application
import com.example.todo.database.TasksDatabase

class TaskApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        TasksDatabase.init(this)
    }
}