/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
import edu.wpi.first.wpilibj.*;

public class PneumaticsTester {
    private XboxController xbox;
    Compressor mainC;
    Pneumatics pn;

    PneumaticsTester()
    {
        mainC = new Compressor(0);
        xbox = new XboxController(0);
        pn = new Pneumatics();
    }

    
}
