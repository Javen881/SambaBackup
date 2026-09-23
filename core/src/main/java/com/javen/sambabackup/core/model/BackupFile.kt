package com.javen.sambabackup.core.model

data class BackupFile(
    val sourceId: String,
    val uri: String,
    val relativePath: String,
    val fileName: String,
    val size: Long,
    val lastModified: Long,
    val md5: String? = null
)
