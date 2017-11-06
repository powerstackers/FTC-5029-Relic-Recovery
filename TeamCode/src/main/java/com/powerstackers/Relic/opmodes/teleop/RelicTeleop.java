/*
 * Copyright (C) 2016 Powerstackers
 *
 * Teleop code for Velocity Vortex.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.powerstackers.Relic.opmodes.teleop;

import com.powerstackers.Relic.common.RelicRobot;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * @author Derek Helm
 */

@SuppressWarnings("unused")
@TeleOp(name = "Relic-Teleop", group = "Powerstackers")
public class RelicTeleop extends OpMode {

    private final ElapsedTime runtime = new ElapsedTime();
    private RelicRobot robot;

    //final View relativeLayout = ((Activity) hardwareMap.appContext).findViewById(R.id.RelativeLayout);

    @Override
    public void init() {

        robot = new RelicRobot(this);
        try {
            robot.initializeRobot();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
        telemetry.addLine("Waiting for start...");
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
        runtime.reset();
    }

    @Override
    public void loop() {
        telemetry.addData("Status", "Running: ");
        //button maps here vvv


//        telemetry here vvv

    }

    /**
     * Stop the robot and make any final assignments.
     */
    @Override
    public void stop() {
        robot.stopAllMotors();
    }
}