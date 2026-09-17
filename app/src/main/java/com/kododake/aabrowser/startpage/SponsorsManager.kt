package com.kododake.aabrowser.startpage

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kododake.aabrowser.databinding.ActivityMainBinding

/**
 * Sponsor networking and upstream sponsorship UI are intentionally disabled in
 * TCDroidAuto. This compatibility class remains so existing call sites compile
 * while guaranteeing that no sponsor list or avatar network requests are made.
 */
class SponsorsManager(
    @Suppress("UNUSED_PARAMETER") private val activity: AppCompatActivity,
    private val binding: ActivityMainBinding,
    @Suppress("UNUSED_PARAMETER") private val callbacks: SponsorsCallbacks
) {

    interface SponsorsCallbacks {
        fun loadUrlFromIntent(url: String)
        fun resolveThemeColor(attrRes: Int): Int
    }

    fun setupSponsorsSection() {
        binding.startPageSponsorsListCard.visibility = View.GONE
        binding.startPageSponsorsHiddenPienCard.visibility = View.GONE
        binding.startPageSponsorsQrImage.visibility = View.GONE
        binding.startPageSponsorsActionButton.visibility = View.GONE
        binding.startPageSponsorsAddress.visibility = View.GONE
    }
}
