package org.usfirst.frc5112.TestRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GrabAndLiftTote extends CommandGroup {

	public GrabAndLiftTote() {
		addSequential(new CloseGripper());
		addSequential(new LiftTote());
	}
}
