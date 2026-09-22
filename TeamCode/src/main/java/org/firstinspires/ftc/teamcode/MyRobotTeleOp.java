package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "My First OpMode")
public class MyRobotTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() {
        // Initialize hardware here
        waitForStart();

        while (opModeIsActive()) {
            // Main robot loop code here
        }
    }
}