/*
 * Copyright 2018 Sollyu，Wonium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.maizz.kotlin.extension.android

import cn.maizz.kotlin.extension.android.android.content.KIExtensionContext
import cn.maizz.kotlin.extension.android.java.io.KIExtensionFile
import cn.maizz.kotlin.extension.android.java.util.KIExtensionDate
import com.sollyu.kotlin.utils.kotlin.KIExtensionString

/**
 * 接入主类
 */
@Suppress("unused")
interface KIExtension :
        KIExtensionContext,
        KIExtensionFile,
        KIExtensionString,

        KIExtensionDate