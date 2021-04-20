package com.yolisstorm.buildsrc

object Versions {
	const val ktlint = "0.40.0"
}

object Libs {
	private object LibraryVersion {

		const val ACTIVITY = "1.2.0-alpha05"
		const val APPCOMPAT = "1.3.0-alpha01"
		const val BTN_WITH_CIRCLE_LOADER = "2.2.0"
		const val CIRCLE_IMAGEVIEW = "3.0.1"
		const val CONSTRAINT_LAYOUT = "2.0.0-beta4"
		const val COORDINATOR_LAYOUT = "1.1.0"
		const val CORE_KTX = "1.4.0-alpha01"
		const val FIREBASE_AUTH = "19.1.0"
		const val FIREBASE_CRASHLYTICS = "2.10.1"
		const val FIREBASE_CORE = "17.2.0"
		const val FIREBASE_KTX = "19.1.0"
		const val FIREBASE_MESSAGING = "20.0.0"
		const val FLOATING_SEARCH_VIEW = "2.1.1"
		const val FRAGMENT = "1.3.0-alpha05"
		const val GLIDE = "4.11.0"
		const val G_MAPS = "17.0.0"
		const val G_MAPS_KTX = "0.3.1"
		const val G_MAPS_LOCATION = "17.0.0"
		const val G_MAPS_PLACES = "2.2.0"
		const val G_MAPS_UTILS_KTX = "0.3.1"
		const val G_PLAY_SERVICES = "17.0.0"
		const val GSON = "2.8.6"
		const val LEAKCANARY = "2.3"
		const val LIFECYCLE = "2.3.0-alpha03"
		const val LIFECYCLE_EXT = "2.2.0"
		const val MATERIAL_CALENDAR = "1.7.0"
		const val MATERIAL = "1.4.0-alpha01"
		const val OKHTTP_3 = "4.6.0"
		const val OKHTTP_LOGGING_INTERCEPTOR = "4.6.0"
		const val PAGING = "3.0.0-SNAPSHOT"
		const val PLAY_CORE = "1.7.2"
		const val RECYCLER_VIEW_SELECTION = "1.1.0-rc01"
		const val RECYCLER_VIEW = "1.2.0-alpha03"
		const val RETROFIT = "2.7.2"
		const val RETROFIT_COROUTINES   =   "0.9.2"
		const val ROOM = "2.2.4"
		const val ROUNDED_IMAGEVIEW = "2.3.0"
		const val SERIALIZATION_RUNTIME = "0.20.0"
		const val SHIMMER = "0.5.0"
		const val SWIPTE_TO_REFRESH_LAYOUT = "1.1.0-rc01"
		const val SUPPORT = "1.1.0"
		const val SUPPORT_CARD_VIEW = "1.0.0"
		const val SUPPORT_CORE_UTILS = "1.0.0"
		const val TIMBER = "4.7.1"
		const val WORK_MANAGER = "2.4.0-beta01"

	}

	const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha14"
	const val jdkDesugar = "com.android.tools:desugar_jdk_libs:1.0.9"

	const val junit = "junit:junit:4.13"

	object Accompanist {
		private const val version = "0.6.0"
		const val coil = "dev.chrisbanes.accompanist:accompanist-coil:$version"
	}

	object Kotlin {
		private const val version = "1.4.30"
		const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
		const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
		const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
	}

	object Coroutines {
		private const val version = "1.4.1"
		const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
		const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
		const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
	}

	object AndroidX {
		const val appcompat = "androidx.appcompat:appcompat:1.2.0-rc01"
		const val coreKtx = "androidx.core:core-ktx:1.5.0-alpha01"

		object Lifecycle {
			private const val version = "2.3.0-beta01"
			const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha02"
			const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
		}

		object Activity {
			const val activityCompose = "androidx.activity:activity-compose:1.3.0-alpha03"
		}

		object Design {
			const val cardView              =   "androidx.cardview:cardview:${LibraryVersion.SUPPORT_CARD_VIEW}"
			const val constraintLayout      =   "androidx.constraintlayout:constraintlayout:${LibraryVersion.CONSTRAINT_LAYOUT}"
			const val coordinatorLayout     =   "androidx.coordinatorlayout:coordinatorlayout:${LibraryVersion.COORDINATOR_LAYOUT}"
			const val material              =   "com.google.android.material:material:${LibraryVersion.MATERIAL}"
			const val recyclerview          =   "androidx.recyclerview:recyclerview:${LibraryVersion.RECYCLER_VIEW}"
			const val recyclerviewSelection =   "androidx.recyclerview:recyclerview-selection:${LibraryVersion.RECYCLER_VIEW_SELECTION}"
			const val swipeToRefreshLayout  =   "androidx.swiperefreshlayout:swiperefreshlayout:${LibraryVersion.SWIPTE_TO_REFRESH_LAYOUT}"
		}

		object Compose {
			const val snapshot = ""
			const val version = "1.0.0-beta01"
			const val navigationVersion = "1.0.0-alpha08"

			@get:JvmStatic
			val snapshotUrl: String
				get() = "https://androidx.dev/snapshots/builds/$snapshot/artifacts/repository/"

			const val foundation = "androidx.compose.foundation:foundation:$version"
			const val layout = "androidx.compose.foundation:foundation-layout:$version"
			const val activity = "androidx.activity:activity-compose:$version"
			const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
			const val liveData = "androidx.compose.runtime:runtime-livedata:$version"
			const val material = "androidx.compose.material:material:$version"
			const val materialIcons = "androidx.compose.material:material-icons-core:$version"
			const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
			const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"
			const val runtime = "androidx.compose.runtime:runtime:$version"
			const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
			const val tooling = "androidx.compose.ui:ui-tooling:$version"
			const val test = "androidx.compose.test:test-core:$version"
			const val uiTest = "androidx.compose.ui:ui-test:$version"
			const val uiTestJUnit = "androidx.compose.ui:ui-test-junit4:$version"
		}

		object Navigation {
			private const val version = "2.3.0"
			const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
			const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
		}

		object Material {
			private const val version = "1.2.0"
			const val material = "com.google.android.material:material:$version"
		}

		object Test {
			private const val version = "1.2.0"
			const val core = "androidx.test:core:$version"
			const val rules = "androidx.test:rules:$version"

			object Ext {
				private const val version = "1.1.2-rc01"
				const val junit = "androidx.test.ext:junit-ktx:$version"
			}

			const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
		}
	}

	object Timber {
		private const val timberVersion = "4.7.1"
		const val main = "com.jakewharton.timber:timber:$timberVersion"
		private const val timberKtVersion = "1.5.1"
		const val kt = "com.github.ajalt:timberkt:$timberKtVersion"
	}

	object Koin {
		private const val version = "2.2.2"
		const val main = "org.koin:koin-android:$version"
		const val viewModel = "org.koin:koin-android-viewmodel:$version"
	}
}