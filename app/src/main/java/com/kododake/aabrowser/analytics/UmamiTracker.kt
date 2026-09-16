package com.kododake.aabrowser.analytics

import android.content.Context

/**
 * Telemetry is intentionally disabled in TCDroidAuto.
 *
 * This compatibility shim remains so upstream call sites continue to compile while
 * guaranteeing that no analytics identifier is created and no telemetry network
 * request is sent.
 */
class UmamiTracker(@Suppress("UNUSED_PARAMETER") context: Context) {
    fun trackEvent(
        @Suppress("UNUSED_PARAMETER") eventName: String,
        @Suppress("UNUSED_PARAMETER") eventData: Map<String, String>? = null
    ) {
        // Intentionally no-op: TCDroidAuto has no telemetry.
    }
}
