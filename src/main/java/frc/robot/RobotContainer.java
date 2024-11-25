package frc.robot;

import frc.robot.Constants.DriveConstants;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.drive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  private final drive m_drive = new drive();

  private final CommandXboxController m_driverController =
      new CommandXboxController(Constants.DriveConstants.kXboxController);

  public RobotContainer() {
    m_drive.setDefaultCommand(new DriveCommand(m_drive, () -> m_driverController.getLeftX(), () -> m_driverController.getLeftY()));
    configureBindings();
  }

  private void configureBindings() {
 
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
