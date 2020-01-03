package ua.brander.core.di.components

import android.content.Context
import dagger.Component
import ua.brander.core.di.modules.LibraryModule

import javax.inject.Singleton

@Component(modules = [LibraryModule::class])
@Singleton
interface LibraryDependencyComponent {
    fun getContext(): Context
}