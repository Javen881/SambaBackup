package com.javen.sambabackup.core.contract

import com.javen.sambabackup.core.model.BackupFile

interface LocalFileScanner {
    suspend fun scan(): List<BackupFile>
}
