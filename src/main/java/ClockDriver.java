package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        ClockDisplay clock1 = new ClockDisplay();
        String clock1Output = clock1.getTime();
        System.out.println("Test " + clock1Output);
        
        ClockDisplay clock2 = new ClockDisplay(3, 45);
        String clock2Output = clock2.getTime();
        System.out.println("Test " + clock2Output);
        
        clock2.setTime(3, 32);
        System.out.println("Tick pre " + clock2.getTime());
        clock2.timeTick();
        System.out.println("Tick post " + clock2.getTime());
        
        clock2.setTime(3, 9);
        System.out.println("Tick pre " + clock2.getTime());
        clock2.timeTick();
        System.out.println("Tick post " + clock2.getTime());
        
        clock2.setTime(1, 59);
        System.out.println("Tick pre " + clock2.getTime());
        clock2.timeTick();
        System.out.println("Tick post " + clock2.getTime());

        clock2.setTime(9, 59);
        System.out.println("Tick pre " + clock2.getTime());
        clock2.timeTick();
        System.out.println("Tick post " + clock2.getTime());
        
        clock2.setTime(23, 59);
        System.out.println("Tick pre " + clock2.getTime());
        clock2.timeTick();
        System.out.println("Tick post " + clock2.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        ClockDisplaySeconds clock3 = new ClockDisplaySeconds();
        System.out.println("Test " + clock3.getTime());
        
        ClockDisplaySeconds clock4 = new ClockDisplaySeconds(3, 45, 23);
        System.out.println("Test " + clock4.getTime());
        
        clock4.setTime(3, 32, 59);
        System.out.println("Tick pre " + clock4.getTime());
        clock4.timeTick();
        System.out.println("Tick post " + clock4.getTime());
        
        clock4.setTime(1, 0, 59);
        System.out.println("Tick pre " + clock4.getTime());
        clock4.timeTick();
        System.out.println("Tick post " + clock4.getTime());
        
        clock4.setTime(1, 59, 59);
        System.out.println("Tick pre " + clock4.getTime());
        clock4.timeTick();
        System.out.println("Tick post " + clock4.getTime());
        
        clock4.setTime(23, 59, 59);
        System.out.println("Tick pre " + clock4.getTime());
        clock4.timeTick();
        System.out.println("Tick post " + clock4.getTime());
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        
         //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour clock5 = new ClockDisplay12Hour();
        System.out.println("Test " + clock5.getTime());
        
        ClockDisplay12Hour clock6 = new ClockDisplay12Hour(3, 45, "PM");
        System.out.println("Test " + clock6.getTime());
        
        clock6.setTime(3, 32, "PM");
        System.out.println("Tick pre "+ clock6.getTime());
        clock6.timeTick();
        System.out.println("Tick post " + clock6.getTime());
        
        clock6.setTime(11, 59, "PM");
        System.out.println("Tick pre "+ clock6.getTime());
        clock6.timeTick();
        System.out.println("Tick post " + clock6.getTime());
        
        clock6.setTime(11, 59, "AM");
        System.out.println("Tick pre "+ clock6.getTime());
        clock6.timeTick();
        System.out.println("Tick post " + clock6.getTime());
        
        clock6.setTime(12, 59, "PM");
        System.out.println("Tick pre "+ clock6.getTime());
        clock6.timeTick();
        System.out.println("Tick post " + clock6.getTime());
    }
}
