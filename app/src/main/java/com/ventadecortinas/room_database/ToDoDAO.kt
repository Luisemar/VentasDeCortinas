package com.ventadecortinas.room_database

import androidx.room.*

@Dao
interface ToDoDAO {
    @Query("SELECT * from ToDo")
    suspend fun getALLTask(): List<ToDo>

    @Query("SELECT * from ToDo WHERE id = :id")
    suspend fun findById(id: Int): ToDo

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTask(Task: ToDo): Long

    @Update
    suspend fun updateTask(task: ToDo)

    @Delete
    suspend fun  deleteTask(task: ToDo)
}
