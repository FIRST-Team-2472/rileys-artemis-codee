package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;

public class intake extends SubsystemBase{
    public TalonFX IntakeMotor = new TalonFX(Constants.MotorConstants.kIntakeWheelsID);
    public TalonFX ConveyerMotor = new TalonFX(Constants.MotorConstants.kConveyorID);
    public TalonFX ElevatorMotor = new TalonFX(Constants.MotorConstants.kElevatorID);
    
    public intake(){

    }
    public void periodic(){
        
    }
}
