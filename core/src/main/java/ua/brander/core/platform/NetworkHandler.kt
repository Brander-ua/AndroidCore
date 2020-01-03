/**
 * Copyright (C) 2018 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ua.brander.core.platform

import android.content.Context
import ua.brander.core.extention.networkInfo
import javax.inject.Inject

/**
 * Injectable class which returns information about the network connection state.
 */
class NetworkHandler
@Inject constructor(private val context: Context) {
    val isConnected
        get() : Boolean {
            val networkInfo = context.networkInfo
            if (networkInfo == null) {
                return false
            } else {
                return networkInfo.isConnected
            }
        }
}