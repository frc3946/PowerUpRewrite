package org.usfirst.frc.team3946.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {

    public Autonomous() {
    	addSequential(new AutoStraight());
    	addSequential(new AutoCubeOut());
    }
}
