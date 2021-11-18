package com.devlomi.fireapp.model

/**
 * Created by Devlomi on 23/08/2017.
 */
// save/change audio state in recyclerView
data class AudibleState (
        var isPlaying: Boolean = false,
        var currentDuration: String? = null,
        var waves:ByteArray?=null,
        var progress: Int = -1,
        var max: Int = -1
)

