package me.uptop.auth_feature.dagger.component

import dagger.Subcomponent
import me.uptop.auth_feature.dagger.module.AuthModule
import me.uptop.core.dagger.scope.ActivityScope

@ActivityScope
@Subcomponent(modules = [AuthModule::class])
interface AuthComponent {
}