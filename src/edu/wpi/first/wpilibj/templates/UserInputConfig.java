/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author Alejandro Carrillo
 */
public class UserInputConfig implements DriveConstants{ // DriveConstants is a Stuylib interface


    int getLeftStickPort() {
        return 1;
    }
    int getRightStickPort() {
        return 2;
    }
    int getExtraStickPort1() {
        return 3;
    }
    int getExtraStickPort2() {
        return 4;
    }

}
