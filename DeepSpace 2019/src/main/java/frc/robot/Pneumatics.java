/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
public class Pneumatics {
    
    DoubleSolenoid test;

    Pneumatics()
    {
        test = new DoubleSolenoid(0, 2, 3);
    }

    public void testOn ()
    {
        test.set(DoubleSolenoid.Value.kForward);
    }

    public void testOff ()
    {
        test.set(DoubleSolenoid.Value.kReverse);
    }
    
}
