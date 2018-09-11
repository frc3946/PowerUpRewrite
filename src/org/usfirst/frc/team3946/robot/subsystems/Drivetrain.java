package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.DriveDJA;
import org.usfirst.frc.team3946.robot.commands.DriveSJA;
import org.usfirst.frc.team3946.robot.commands.DriveTDJ;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public WPI_TalonSRX frontLeft = new WPI_TalonSRX(RobotMap.frontLeft);
	public WPI_TalonSRX frontRight = new WPI_TalonSRX(RobotMap.frontRight);
	public VictorSPX backLeft = new VictorSPX(RobotMap.backLeft);
	public VictorSPX backRight = new VictorSPX(RobotMap.backRight);
	public WPI_TalonSRX backLeftT = new WPI_TalonSRX(3);
	public WPI_TalonSRX backRightT = new WPI_TalonSRX(4);
	public DifferentialDrive diffDrive = new DifferentialDrive(frontLeft, frontRight);
	
	public void TankDrive(double speedLeft, double speedRight) {
		backLeft.follow(frontLeft);
		backRight.follow(frontRight);
		
		diffDrive.tankDrive(speedLeft, speedRight);
	}
	
	public void ArcadeDrive(double forward, double turn) {
		backLeftT.follow(frontLeft);
		backRightT.follow(frontRight);
		
		diffDrive.arcadeDrive(forward, turn);
	}
	
	public void demoDrive(double forward, double turn) {
		backLeft.follow(frontLeft);
		backRight.follow(frontRight);		
		
		diffDrive.arcadeDrive(forward, turn);
	}
		
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveDJA());
    }
}