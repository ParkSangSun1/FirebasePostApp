package com.pss.firebase_post_app.view

import androidx.activity.viewModels
import com.pss.firebase_post_app.R
import com.pss.firebase_post_app.base.BaseActivity
import com.pss.firebase_post_app.databinding.ActivityMainBinding
import com.pss.firebase_post_app.viewmode.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val mainViewModel by viewModels<MainViewModel>()


    override fun init() {

    }
}