package com.devlomi.fireapp.activities.settings

import android.annotation.TargetApi
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.Navigation
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import com.devlomi.fireapp.R
import com.devlomi.fireapp.activities.BackupChatActivity
import com.devlomi.fireapp.activities.BaseActivity
import com.devlomi.fireapp.utils.DirManager
import com.devlomi.fireapp.utils.FileUtils
import com.devlomi.fireapp.utils.SharedPreferencesManager
import com.devlomi.fireapp.views.dialogs.IgnoreBatteryDialog
import com.devlomi.fireapp.views.dialogs.IgnoreBatteryDialog.OnDialogClickListener
import kotlinx.android.synthetic.main.activity_settings.*
import java.io.IOException

/**
 * A [PreferenceActivity] that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 *
 *
 * See [
 * Android Design: Settings](http://developer.android.com/design/patterns/settings.html) for design guidelines and the [Settings
 * API Guide](http://developer.android.com/guide/topics/ui/settings.html) for more information on developing a Settings UI.
 */
class SettingsActivity : BaseActivity() {
    override fun enablePresence() = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setupActionBar()

        val findNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        findNavController.setGraph(R.navigation.nav_settings)
        findNavController.addOnDestinationChangedListener { controller, destination, arguments ->
            supportActionBar?.title = destination.label
        }

    }

    /**
     * Set up the [android.app.ActionBar], if the API is available.
     */
    private fun setupActionBar() {
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        /**
         * A preference value change listener that updates the preference's summary
         * to reflect its new value.
         */
        private val sBindPreferenceSummaryToValueListener = Preference.OnPreferenceChangeListener { preference, value ->
            val stringValue = value.toString()
            if (preference is ListPreference) {
//                 For list preferences, look up the correct display value in
//                 the preference's 'entries' list.
                val listPreference = preference
                val index = listPreference.findIndexOfValue(stringValue)

//                 Set the summary to reflect the new value.
                preference.setSummary(
                        if (index >= 0) listPreference.entries[index] else null)
            } else {
//                 For all other preferences, set the summary to the value's
//                 simple string representation.
                preference.summary = stringValue
            }
            true
        }



        /**
         * Binds a preference's summary to its value. More specifically, when the
         * preference's value is changed, its summary (line of text below the
         * preference title) is updated to reflect the value. The summary is also
         * immediately updated upon calling this method. The exact display format is
         * dependent on the type of preference.
         *
         * @see .sBindPreferenceSummaryToValueListener
         */
        fun bindPreferenceSummaryToValue(preference: Preference?) {
//         Set the listener to watch for value changes.
            preference?.onPreferenceChangeListener = sBindPreferenceSummaryToValueListener

//         Trigger the listener immediately with the preference's
//         current value.
            sBindPreferenceSummaryToValueListener.onPreferenceChange(preference,
                    PreferenceManager
                            .getDefaultSharedPreferences(preference?.context)
                            .getString(preference?.key, ""))
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}