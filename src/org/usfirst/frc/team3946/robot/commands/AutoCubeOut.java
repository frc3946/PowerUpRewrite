package org.usfirst.frc.team3946.robot.commands;

import org.usfirst.frc.team3946.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoCubeOut extends Command {

    public AutoCubeOut() {
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(1.75);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.intakeMotor1.set(.45);
    	Robot.intake.intakeMotor2.set(-.45);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
