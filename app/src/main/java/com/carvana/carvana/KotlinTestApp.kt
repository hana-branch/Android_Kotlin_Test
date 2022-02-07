package com.carvana.carvana

import io.branch.referral.Branch
import android.app.Application


class KotlinTestApp : Application()  {
    override fun onCreate() {
        super.onCreate()

        // Branch logging for debugging
        Branch.enableLogging();

        // Branch object initialization
        Branch.getAutoInstance(this);
    }
}