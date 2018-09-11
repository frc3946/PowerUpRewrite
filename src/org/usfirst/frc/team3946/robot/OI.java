/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3946.robot;

import org.usfirst.frc.team3946.lowpowercommands.CubeInLow;
import org.usfirst.frc.team3946.lowpowercommands.CubeOutLow;
import org.usfirst.frc.team3946.robot.commands.Intake45Deg;
import org.usfirst.frc.team3946.robot.commands.IntakeCubeIn;
import org.usfirst.frc.team3946.robot.commands.IntakeCubeOut;
import org.usfirst.frc.team3946.robot.commands.IntakePos;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick leftStick = new Joystick(RobotMap.leftJoystick);
	public Joystick rightStick = new Joystick(RobotMap.rightJoystick);
	public XboxController driverController = new XboxController(RobotMap.driverController);
	public XboxController lowPowerController = new XboxController(RobotMap.lowPowerController);
	public Joystick driverStick = new Joystick(4);

	Button cubeOut = new JoystickButton(driverController, 1);
	Button cubeIn = new JoystickButton(driverController, 2);
	Button intake45 = new JoystickButton(driverController, 3);
	Button intake0 = new JoystickButton(driverController, 4);
	Button cubeInLow = new JoystickButton(driverController, 5);
	Button cubeOutLow = new JoystickButton(driverController, 6);
	
	Button cubeInJoy = new JoystickButton(leftStick, 1);
	Button cubeOutJoy = new JoystickButton(leftStick, 2);
	Button intake45Joy = new JoystickButton(leftStick, 4);
	Button intake0Joy = new JoystickButton(leftStick, 5);
	
	public OI() {		
		cubeIn.whileHeld(new IntakeCubeIn());
		cubeOut.whileHeld(new IntakeCubeOut());
		intake45.whenPressed(new Intake45Deg());
		intake0.whenPressed(new IntakePos());
		cubeInLow.whileHeld(new CubeInLow());
		cubeOutLow.whileHeld(new CubeOutLow());
		
		cubeInJoy.whileHeld(new IntakeCubeIn());
		cubeOutJoy.whileHeld(new IntakeCubeOut());
		intake45Joy.whenPressed(new Intake45Deg());
		intake0Joy.whenPressed(new IntakePos());
	}
}
