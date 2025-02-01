package com.example.todo.database

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todo.database.dao.TaskDao
import com.example.todo.database.model.Task

@Database(entities = arrayOf(Task::class), version = 1)
abstract class TasksDatabase : RoomDatabase() {
    abstract fun getTaskDoa() : TaskDao

    companion object{
        private var DATABASE_INSTANCE : TasksDatabase? = null

        fun init(applicationContext: Context){
            if (DATABASE_INSTANCE == null){
                DATABASE_INSTANCE=
                    Room.databaseBuilder(applicationContext
                        ,TasksDatabase::class.java
                        ,"Tasks Database")
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
            }
        }
        fun getInstance() : TasksDatabase {

            return DATABASE_INSTANCE!!
        }
    }
}