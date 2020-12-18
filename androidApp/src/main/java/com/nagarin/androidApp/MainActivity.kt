package com.nagarin.androidApp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.ui.platform.setContent
import com.nagarin.androidApp.ui.BaseProjectTheme

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			BaseProjectTheme {
				Text("Hello")
			}
		}
	}
}
