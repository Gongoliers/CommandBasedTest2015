package org.usfirst.frc5112.TestRobot.commands;

import org.usfirst.frc5112.TestRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftTote extends Command {

	public LiftTote() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.winch);
		setTimeout(2);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.winch.up(0.8);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.winch.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
