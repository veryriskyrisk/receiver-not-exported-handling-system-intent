package com.veracode.intents

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyReceiverDoesntNeedToBeExported : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("yatta!", intent.toString());
    }
}