// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;


import frc.robot.RobotContainer;
import frc.robot.RobotContainer.subsystems;

public class DriveCommand extends CommandBase {
  /** Creates a new XDrive. */
  public DriveCommand() {

    addRequirements(subsystems.mecaDrive);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double forward = RobotContainer.driver.getLeftY();
    double rotation = RobotContainer.driver.getRightX();
    double strafe = RobotContainer.driver.getLeftX();

    subsystems.mecaDrive.mecaDrive(forward, strafe, rotation);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
