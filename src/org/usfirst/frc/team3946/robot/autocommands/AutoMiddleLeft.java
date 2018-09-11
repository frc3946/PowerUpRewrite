package org.usfirst.frc.team3946.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoMiddleLeft extends CommandGroup {

    public AutoMiddleLeft() {
        addSequential(new AutoMiddleStraight());
        addSequential(new AutoMiddleLeftTurn());
        addSequential(new AutoLeftStraighten());
    	addSequential(new AutoSmolStraight());
        addSequential(new AutoCubeOut());
    }
}
