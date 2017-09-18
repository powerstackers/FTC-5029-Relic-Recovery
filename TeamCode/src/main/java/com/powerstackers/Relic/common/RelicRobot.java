/*
 * Copyright (C) 2016 Powerstackers
 *
 * Basic configurations and capabilities of our robot.
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

package com.powerstackers.velocity.common;

import com.powerstackers.velocity.common.enums.PublicEnums;
import com.powerstackers.velocity.common.enums.PublicEnums.MotorSetting;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.UltrasonicSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.I2cAddr;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 * Basic configurations for our robot. This class contains methods to make the robot do stuff.
 *
 * @author Derek Helm
 */
@SuppressWarnings("unused")
public class RelicRobot {

    protected final OpMode mode;
    /*
    Looking at the robot from above:
        ------F------
        |1\\     //2|
        |           |
        |           |
        |3//     \\4|
        -------------
     */
	 
	//Set Hardware Names VVV
    //ex. DcMotor motorDrive1;

    private final ElapsedTime timer = new ElapsedTime();

    /**
     * Construct a Robot object.
     *
     * @param mode The OpMode in which the robot is being used.
     */
    public RelicRobot(OpMode mode) {
        this.mode = mode;
    }

    /**
     * Initialize the robot's servos and sensors.
     */
    public void initializeRobot() throws InterruptedException {
        mode.telemetry.addData("Status: ", "Initialization Started");
        mode.telemetry.update();
        mode.telemetry.addData("Status: ", "Initalizing");
        mode.telemetry.update();
		
		//Map Hardware and set position
        //ex. motorDrive1 = mode.hardwareMap.dcMotor.get("motorFrontLeft");
        
        mode.telemetry.addData("Status: ", "Initialized");
        mode.telemetry.update();
    }

    //public void displayDirection() {
        //mode.telemetry.addData("Robot Direction:", robotDirection);
        //mode.telemetry.update();
    }
	
	//Custom Methods VVV

    /**
     * Completely stop the drive motors.
     */
    public void stopMovement() {
        //motorDrive1.setPower(0.0);
        //motorDrive2.setPower(0.0);
        //motorDrive3.setPower(0.0);
        //motorDrive4.setPower(0.0);
    }

    /**
     * Completely stop all motors on the robot.
     */
    public void stopAllMotors() {
        //motorDrive1.setPower(0.0);
        //motorDrive2.setPower(0.0);
        //motorDrive3.setPower(0.0);
        //motorDrive4.setPower(0.0);

        //motorShooter1.setPower(0.0);
        //motorPickup.setPower(0.0);
        //motorLLift.setPower(0.0);
        //motorRLift.setPower(0.0);
    }
	
	//telemetry Methods VVV

    }
