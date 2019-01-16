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

    WPI_TalonSRX talon1;
    WPI_TalonSRX talon3;
    WPI_TalonSRX talon2;
    WPI_TalonSRX talon4;

    DifferentialDrive drive;

    DriveTrain () {
        talon1 = new WPI_TalonSRX(4); //2 on power up
        talon2 = new WPI_TalonSRX(11); //3 on power up
        talon3 = new WPI_TalonSRX(7); // 5 on power up
        talon4 = new WPI_TalonSRX(10); // 6 on power up

        controller = new XboxController(0);
        talon1.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower,talon3.getDeviceID());

        talon2.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower,talon4.getDeviceID());

        drive = new DifferentialDrive(talon3, talon4);
    }
    public void teleopDrive(){
      
        double speed = (controller.getY(edu.wpi.first.wpilibj.GenericHID.Hand.kLeft)) * 0.6;
        double rotation = (controller.getX(edu.wpi.first.wpilibj.GenericHID.Hand.kRight)) * .6;

        drive.arcadeDrive(speed, rotation);
    }
}
