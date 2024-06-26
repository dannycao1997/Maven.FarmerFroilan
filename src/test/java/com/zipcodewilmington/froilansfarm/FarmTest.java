package com.zipcodewilmington.froilansfarm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

public class FarmTest {
    private Farm farm;
    @Before
    public void setUp() {
        farm = new Farm();
    }
    
    @Test
    public void testFarmInitialization(){
        Farm farm = new Farm();

        Assert.assertEquals(farm.getFarmHouse()); // expected 1 FarmHouse
        Assert.assertEquals(4, farm.getChickenCoop().size()); // expected 4 ChickenCoops
        Assert.assertEquals(3, farm.getStable().size()); // expected 3 Stables
    }

    @Test
    public void testAddStable() { //Add Stable Farm Test
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        farm.addStable(stable1); //Adding new stable to Farm
        farm.addStable(stable2); //Adding new stable to Farm
        farm.addStable(stable3); //Adding new stable to Farm

        Assert.assertEquals(3, farm.size()); // Farm should have 3 Stable after addition
    }

    @Test
    public void testRemoveStable() { //Remove Stable Farm Test
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();


        farm.addStable(stable1);
        farm.addStable(stable2);
        farm.addStable(stable3);
        farm.removeStable(stable2); //Removing Stable from Farm

        Assert.assertFalse(farm.contains(stable2)); //Farm should not contain stable2 after removal
    }

    @Test
    public void testGetStable() { //Get Stable Farm Test
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        farm.addStable(stable1);
        farm.addStable(stable2);
        farm.addStable(stable3);

        Assert.assertEquals(stable1, farm.get(0)); //Should retrieve/get stable1 by index 0
        Assert.assertEquals(stable2, farm.get(1)); //Should retrieve/get stable2 by index 1
        Assert.assertEquals(stable3, farm.get(2)); //Should retrieve/get stable2 by index 2
    }

    @Test
    public void testAddChickenCoop() { //Add ChickenCoop Farm Test
        Farm farm = new Farm();
        ChickenCoop chickencoop1 = new Chickenoop();
        ChickenCoop chickencoop2 = new Chickenoop();
        ChickenCoop chickencoop3 = new Chickenoop();

        farm.addChickenCoop(chickencoop1); //Adding new stable to Farm
        farm.addChickenCoop(chickencoop2); //Adding new stable to Farm
        farm.addChickenCoop(chickencoop3); //Adding new stable to Farm

        Assert.assertTrue(farm.getChickenCoop().contains(chickencoop1, chickencoop2, chickencoop3));
    }

    @Test
    public void testRemoveChickenCoop() { //Remove ChickenCoop Farm Test
        Farm farm = new Farm();
        ChickenCoop chickencoop1 = new Chickenoop();
        ChickenCoop chickencoop2 = new Chickenoop();

        farm.addChickenCoop(chickencoop1);
        farm.addChickenCoop(chickencoop2);
        farm.removeChickenCoop(chickencoop2); //Removing ChickenCoop2 from Farm

        Assert.assertFalse(farm.getChickenCoop().contains(chickencoop2)); //Farm should not contain chickencoop2 after removal
    }

    @Test
    public void testGetChickenCoop() { //Get ChickenCoop Farm Test
        Farm farm = new Farm();
        ChickenCoop chickencoop1 = new Chickenoop();
        ChickenCoop chickencoop2 = new Chickenoop();

        farm.addChickenCoop(chickencoop1);
        farm.addChickenCoop(chickencoop2);

        Assert.assertEquals(chickencoop1, farm.get(0)); //Should retrieve/get chickencoop1 by index 0
        Assert.assertEquals(chickencoop2, farm.get(1)); //Should retrieve/get chickencoop2 by index 1
    }
}