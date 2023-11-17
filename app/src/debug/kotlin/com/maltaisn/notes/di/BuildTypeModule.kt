

package com.maltaisn.notes.di

import com.maltaisn.notes.ui.home.BuildTypeBehavior
import com.maltaisn.notes.ui.home.DebugBuildTypeBehavior
import dagger.Binds
import dagger.Module

@Module
abstract class BuildTypeModule {

    @get:Binds
    abstract val DebugBuildTypeBehavior.bind: BuildTypeBehavior
}
