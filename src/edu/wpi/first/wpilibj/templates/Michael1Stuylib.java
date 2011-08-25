/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.*;
//TODO: Add stuylib import statement


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Michael1Stuylib extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */

    DashboardUpdater du; // From Stuylib
    UserInput in;   // From Stuylib
    DriveConstants config; // DriveConstants interface is from Stuylib

    public RobotTemplate() {
        config = new UserInputConfig(); // UserInputConfig class is user-defined
        in = new UserInput(config);
        out = new UserOutput(in, Log.DEBUG_STDOUT); // Takes UserInput reference and logging mode
        du = new DashboardUpdater(this);
    }
    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {

    }

}
