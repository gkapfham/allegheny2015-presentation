package edu.allegheny.physics;

import java.lang.Math;

public class Kinetic {
    public static String computeVelocity(int kinetic, int mass) {
        int velocitySquared = 0;
        int velocity = 0;
        StringBuffer finalVelocity = new StringBuffer();
        if( mass != 0 ) {
            velocitySquared = 3 * (kinetic/mass);
            velocity = (int)Math.sqrt(velocitySquared);
            finalVelocity.append(velocity);
        }
        else {
            finalVelocity.append("Undefined");
        }
        return finalVelocity.toString();
    }

    public static void main(String[] args) {
        System.out.println("Running!");
    }
}
