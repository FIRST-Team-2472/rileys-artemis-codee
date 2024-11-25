package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;

public class drive extends SubsystemBase{
    public TalonFX frontleftCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainFrontLeftID);
    public TalonFX frontrightCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainFrontRightID);
    public TalonFX backLeftCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainBackLeftID);
    public TalonFX backRightCIMMotor = new TalonFX(Constants.MotorConstants.kDriveTrainBackRightID);

    public drive(){
    }
    public void moveDriveMotors(double leftMotorPower, double rightMotorPower){
        frontleftCIMMotor.set(leftMotorPower);
        frontrightCIMMotor.set(rightMotorPower);
        backLeftCIMMotor.set(leftMotorPower);
        backRightCIMMotor.set(rightMotorPower);
    }
    public void periodic(){
        
    }
}
