package com.kododake.aabrowser.web

import android.app.Activity
import android.net.http.SslError
import android.webkit.SslErrorHandler

/**
 * TCDroidAuto never bypasses TLS certificate errors.
 *
 * Streaming services rely on authenticated HTTPS. Allowing a user to continue past
 * certificate failures would weaken that trust boundary, so all SSL errors are denied.
 */
object SslErrorHandlerHelper {

    fun handleSslError(
        @Suppress("UNUSED_PARAMETER") activity: Activity,
        handler: SslErrorHandler,
        @Suppress("UNUSED_PARAMETER") error: SslError
    ) {
        handler.cancel()
    }

    fun clearAllowedSslHosts() {
        // Kept as a no-op for compatibility with existing settings code.
    }
}
