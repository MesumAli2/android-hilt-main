package com.example.android.hilt.data

import dagger.Provides


interface LoggerDataSource {

    fun addLog(msg : String)
    fun getAllLogs(callback : (List<Log>) -> Unit)
    fun removeLogs()
}