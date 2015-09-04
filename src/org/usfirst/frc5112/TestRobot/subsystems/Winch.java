// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5112.TestRobot.subsystems;

import org.usfirst.frc5112.TestRobot.RobotMap;
import org.usfirst.frc5112.TestRobot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	SpeedController motor = RobotMap.winchMotor;
	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
		setDefaultCommand(new OperatorWinch());
		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void up(double speed) {
		motor.set(-speed);
	}

	public void down(double speed) {
		motor.set(speed);
	}

	public void stop() {
		motor.set(0);
	}

	public void operate(double up, double down) {
		if (up > 0.1) {
			up(7 * up / 8.0);
		} else if (down > 0.1) {
			down(5 * down / 7.0);
		} else {
			stop();
		}
	}
}
