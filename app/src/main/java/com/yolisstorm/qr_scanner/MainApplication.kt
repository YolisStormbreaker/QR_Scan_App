package com.yolisstorm.qr_scanner

import android.app.Application
import com.github.ajalt.timberkt.Timber

class MainApplication: Application() {

	override fun onCreate() {
		super.onCreate()
		
		if (BuildConfig.DEBUG)
			Timber.plant(Timber.DebugTree())
	}
}