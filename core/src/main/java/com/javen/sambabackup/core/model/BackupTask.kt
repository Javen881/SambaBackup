package com.javen.sambabackup.core.model

data class BackupTask(
    val file: BackupFile,
    val remotePath: String,
    val action: BackupAction
)
