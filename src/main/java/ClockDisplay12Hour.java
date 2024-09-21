package src.main.java;


public class ClockDisplay12Hour
{
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String display;
    private String amPm;

    public ClockDisplay12Hour(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        amPm = "AM";
        updateDisplay();
    }
    

    public ClockDisplay12Hour(int hour, int minute, String time){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute, time);
        updateDisplay();
    }
    
 
    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 0){
            hours.increment();        
        }
        if( hours.getValue() == 12){
            if(minutes.getValue()==0){
            
                if(amPm.equals("AM")){
                        amPm = "PM";
                    }
                else{
                      amPm = "AM";
                }
            }
        }
        updateDisplay();
        }
    
   


    public void setTime(int hour, int minute, String time){
        amPm = time;
        minutes.setValue(minute);
        hours.setValue(hour);
        updateDisplay();       
    }
    
    
    public String getTime(){
        return display;
    }
    
    
    

    public void updateDisplay(){
        String output = "";
        output = hours.getDisplayValue();
        output = output +":";
        output = output + minutes.getDisplayValue();
        display = output+amPm;    
    }
}

