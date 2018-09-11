package org.usfirst.frc.team3946.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoMiddleRight extends CommandGroup {

    public AutoMiddleRight() {
    	addSequential(new AutoMiddleStraight());
    	addSequential(new AutoMiddleRightTurn());
    	addSequential(new AutoMiddleRightStraighten());
    	addSequential(new AutoSmolStraight());
    	addSequential(new AutoCubeOut());
    }
}
