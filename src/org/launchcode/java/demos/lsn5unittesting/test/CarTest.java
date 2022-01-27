package org.launchcode.java.demos.lsn5unittesting.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {

    Car test_car;

    // create Car for use within tests below
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    // tests if constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    // tests if gasTankLevel is accurate after driving within tank range
    @Test
    public void withinTankRange(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    // tests if gasTankLevel is accurate after attempting to drive past tank range
    // (honestly not sure if I understood the instructions for this one, but this passes...)
    @Test
    public void outOfTankRange(){
        test_car.drive(550);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    // tests that Car can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot hold more fuel than the size of the tank.");
    }

}
