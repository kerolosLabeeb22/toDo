package com.example.todo.database.design_pattern

object AppConstants {

}

class Database private constructor(){
    companion object {
        private var instance : Database? = null
        fun getInstance():Database {
            if(instance == null){
                instance = Database()
            }
            return instance!!
        }
    }

}