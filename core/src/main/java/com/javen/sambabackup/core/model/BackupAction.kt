package com.javen.sambabackup.core.model

enum class BackupAction {
    UPLOAD_NEW,
    UPLOAD_MODIFIED,
    RECHECK_HASH,
    SKIP
}
