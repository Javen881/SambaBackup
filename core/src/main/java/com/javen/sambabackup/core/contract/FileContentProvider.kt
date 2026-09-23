package com.javen.sambabackup.core.contract

import com.javen.sambabackup.core.model.BackupFile
import java.io.InputStream

interface FileContentProvider {
    fun open(file: BackupFile): InputStream
}
