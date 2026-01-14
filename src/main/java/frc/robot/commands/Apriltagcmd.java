package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.LimelightHelpers;

public class Apriltagcmd extends Command{

    @Override
    public void initialize() {
        if(LimelightHelpers.getTargetPose3d_RobotSpace("").getZ() > 4){
                System.out.println("its far I thinky think");
        }
    }
    
}
