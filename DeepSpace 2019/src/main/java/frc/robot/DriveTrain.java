/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.FollowerType;
import com.ctre.phoenix.motorcontrol.can.*;
/**
 * Add your docs here.
 */
public class DriveTrain {

    WPI_TalonSRX talon1;
    WPI_TalonSRX talon2;
    WPI_TalonSRX talon3;
    WPI_TalonSRX talon4;
    DifferentialDrive drive;
    XboxController xbox;

    DriveTrain()
    {
        talon1 = new WPI_TalonSRX(2);  //Left forward
        talon2 = new WPI_TalonSRX(3);  //left backward
        talon3 = new WPI_TalonSRX(5);  //right forward
        talon4 = new WPI_TalonSRX(6);  //right backward

       talon1.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower, talon1.getDeviceID());
       talon3.set(com.ctre.phoenix.motorcontrol.ControlMode.Follower, talon3.getDeviceID());

       drive = new DifferentialDrive(talon1, talon3);

       xbox = new XboxController(0);
    }

    public void teleopDrive()
    {

        double rotation = (xbox.getX(edu.wpi.first.wpilibj.GenericHID.Hand.kRight)) * .6;
        double speed = (xbox.getY(edu.wpi.first.wpilibj.GenericHID.Hand.kLeft)) * 0.6;
        drive.arcadeDrive(speed, rotation);
        

    }
}
