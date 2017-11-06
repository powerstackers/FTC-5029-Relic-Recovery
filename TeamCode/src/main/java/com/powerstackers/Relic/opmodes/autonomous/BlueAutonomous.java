/*
 * Copyright (C) 2016 Powerstackers
 *
 * Code to run our 2016-17 robot.
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

package com.powerstackers.velocity.opmodes.autonomous;

import com.powerstackers.Relic.common.RelicAutonomousProgram;
import com.powerstackers.velocity.common.enums.PublicEnums;
import com.powerstackers.velocity.common.enums.StartingPosition;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

/**
 * @author Jonathan Thomas
 *
 */
@SuppressWarnings("unused")
@Autonomous(name = "Blue Auto", group = "Powerstackers")
@Disabled
public class BlueAutonomous extends RelicAutonomousProgram {
    public BlueAutonomous() {
        super(PublicEnums.AllianceColor.BLUE, StartingPosition.MIDDLE);
    }
}