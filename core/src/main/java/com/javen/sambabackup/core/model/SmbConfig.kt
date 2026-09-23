package com.javen.sambabackup.core.model

data class SmbConfig(
    val host: String,
    val port: Int = 445,
    val shareName: String,
    val remoteRoot: String,
    val username: String,
    val password: String,
    val domain: String = ""
)
