package com.javen.sambabackup.core.contract

import com.javen.sambabackup.core.model.SmbConfig
import java.io.InputStream

interface SmbClient {
    suspend fun testConnection(config: SmbConfig): Boolean

    suspend fun ensureDirectory(config: SmbConfig, remotePath: String)

    suspend fun exists(config: SmbConfig, remotePath: String): Boolean

    suspend fun getFileSize(config: SmbConfig, remotePath: String): Long?

    suspend fun upload(
        config: SmbConfig,
        input: InputStream,
        fileSize: Long,
        remotePath: String,
        progress: (transferred: Long, total: Long) -> Unit
    )

    suspend fun rename(config: SmbConfig, oldPath: String, newPath: String)

    suspend fun delete(config: SmbConfig, remotePath: String)
}
