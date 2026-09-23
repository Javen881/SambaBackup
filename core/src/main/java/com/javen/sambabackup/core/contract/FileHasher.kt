package com.javen.sambabackup.core.contract

import com.javen.sambabackup.core.model.BackupFile

interface FileHasher {
    suspend fun md5(file: BackupFile): String
}
