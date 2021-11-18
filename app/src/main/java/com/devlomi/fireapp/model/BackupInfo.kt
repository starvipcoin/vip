package com.devlomi.fireapp.model

data class BackupInfo(
    val backupType: Int,
    val version: String,
    val fileSize: Long,
    val timestamp: Long
)
