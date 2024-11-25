package frc.robot.commands;

import frc.robot.subsystems.drive;
import edu.wpi.first.wpilibj2.command.Command;
import java.util.function.Supplier;

public class DriveCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final drive m_subsystem;
  private final Supplier<Double> joystickXSupplier, joystickYSupplier;

  public DriveCommand(drive subsystem, Supplier<Double> joystickXSupplier, Supplier<Double> joystickYSupplier) {
    m_subsystem = subsystem;
    this.joystickXSupplier = joystickXSupplier;
    this.joystickYSupplier = joystickYSupplier;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    double leftMotorPower = joystickYSupplier.get() + joystickXSupplier.get();
    double rightMotorPower = joystickYSupplier.get() - joystickXSupplier.get();
    m_subsystem.moveDriveMotors(leftMotorPower, rightMotorPower);
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
