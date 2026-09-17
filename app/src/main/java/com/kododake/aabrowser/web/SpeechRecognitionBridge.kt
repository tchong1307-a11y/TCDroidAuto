package com.kododake.aabrowser.web

import android.net.Uri
import android.webkit.WebView
import androidx.webkit.WebMessageCompat

/**
 * Native speech recognition is intentionally disabled in TCDroidAuto.
 *
 * This compatibility shim preserves existing call sites without exposing a
 * JavaScript/WebMessage speech bridge, requesting microphone access, starting
 * Android SpeechRecognizer, or injecting a speech-recognition polyfill.
 */
class SpeechRecognitionBridge(
    @Suppress("UNUSED_PARAMETER") webView: WebView,
    @Suppress("UNUSED_PARAMETER") onRequestMicrophoneAccess: (String?) -> Unit
) {
    fun handleWebMessage(
        @Suppress("UNUSED_PARAMETER") message: WebMessageCompat,
        @Suppress("UNUSED_PARAMETER") sourceOrigin: Uri,
        @Suppress("UNUSED_PARAMETER") isMainFrame: Boolean,
        @Suppress("UNUSED_PARAMETER") currentPageUrl: String?
    ) {
        // Intentionally ignored.
    }

    fun onPermissionResult(@Suppress("UNUSED_PARAMETER") granted: Boolean) {
        // No microphone permission is ever requested by this bridge.
    }

    fun destroy() {
        // No native speech resources are allocated.
    }

    fun hasPendingPermissionRequest(): Boolean = false

    companion object {
        const val BRIDGE_OBJECT_NAME = "_SpeechBridgeChannel"
        const val POLYFILL_JS = ""
    }
}
