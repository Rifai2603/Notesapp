

package com.maltaisn.notes.di

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.maltaisn.notes.model.DefaultJsonManager
import com.maltaisn.notes.model.DefaultLabelsRepository
import com.maltaisn.notes.model.DefaultNotesRepository
import com.maltaisn.notes.model.JsonManager
import com.maltaisn.notes.model.LabelsRepository
import com.maltaisn.notes.model.NotesRepository
import com.maltaisn.notes.model.ReminderAlarmCallback
import com.maltaisn.notes.receiver.ReceiverAlarmCallback
import dagger.Binds
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json

@Module(includes = [
    DatabaseModule::class,
    BuildTypeModule::class,
])
abstract class AppModule {

    @get:Binds
    abstract val DefaultNotesRepository.bindNotesRepository: NotesRepository

    @get:Binds
    abstract val DefaultLabelsRepository.bindLabelsRepository: LabelsRepository

    @get:Binds
    abstract val DefaultJsonManager.bindJsonManager: JsonManager

    @get:Binds
    abstract val ReceiverAlarmCallback.bindAlarmCallback: ReminderAlarmCallback

    companion object {
        @Provides
        fun providesSharedPreferences(context: Context): SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)

        @get:Provides
        val json
            get() = Json {
                encodeDefaults = false
                ignoreUnknownKeys = true
            }
    }
}
