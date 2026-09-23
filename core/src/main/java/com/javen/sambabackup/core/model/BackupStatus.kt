package com.javen.sambabackup.core.model

enum class BackupStatus {
    PENDING,
    CHECKING,
    SKIPPED,
    UPLOADING,
    SUCCESS,
    FAILED
}
