package com.example.todo.database.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.todo.database.model.Task
import java.util.Date

interface TaskDao {

    @Insert
    fun insertTask(task: Task)
    @Delete
    fun deleteTask(task: Task)
    @Query("select * from tasks")
    fun getAllTask():List<Task>
    @Update
    fun update(task: Task)
    @Query("select * from tasks where date = :selectedDate")
    fun getTasksByDate(selectedDate: Date):List<Task>
}