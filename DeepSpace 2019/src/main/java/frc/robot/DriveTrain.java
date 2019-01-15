/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.*;
/**
 * Add your docs here.
 */
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
public class DriveTrain {
    XboxController controller;

    WPI_TalonSRX talon2;
    WPI_TalonSRX talon3;
    WPI_TalonSRX talon5;
    WPI_TalonSRX talon6;

    DifferentialDrive drive;

    DriveTrain () {
        talon2 = new WPI_TalonSRX(2);
        talon3 = new WPI_TalonSRX(3);
        talon5 = new WPI_TalonSRX(5);
        talon6 = new WPI_TalonSRX(6);

        controller = new XboxController(0);
        talon3.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower,talon2.getDeviceID());

        talon5.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower,talon6.getDeviceID());

        drive = new DifferentialDrive(talon2, talon6);
    }
    public void teleopDrive(){
      
        double speed = (controller.getY(edu.wpi.first.wpilibj.GenericHID.Hand.kLeft)) * -.6;
        double rotation = (controller.getX(edu.wpi.first.wpilibj.GenericHID.Hand.kRight)) * .6;

        drive.arcadeDrive(speed, rotation);
    }
}
