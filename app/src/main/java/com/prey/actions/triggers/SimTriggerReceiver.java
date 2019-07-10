/*******************************************************************************
 * Created by Orlando Aliaga
 * Copyright 2019 Prey Inc. All rights reserved.
 * License: GPLv3
 * Full license at "/LICENSE"
 ******************************************************************************/
package com.prey.actions.triggers;

import android.content.Context;
import android.content.Intent;

import com.prey.PreyLogger;
import com.prey.events.factories.EventFactory;

public class SimTriggerReceiver extends TriggerReceiver {

    public void onReceive(Context context, final Intent intent) {
        if (intent != null) {
            PreyLogger.d("Trigger SimTriggerReceiver:" + intent.getAction());
            String action = intent.getAction();
            String name = "";
            if (EventFactory.BOOT_COMPLETED.equals(action))
                name = "sim_changed";
            if (EventFactory.SIM_STATE_CHANGED.equals(action))
                name = "sim_changed";
            if (!"".equals(name)) {
                execute(context, name);
            }
        }
    }
}
