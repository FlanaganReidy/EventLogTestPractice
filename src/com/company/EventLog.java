package com.company;

import java.util.ArrayList;
import java.util.List;

public class EventLog {
    private static List<Event> eventList;

    public static boolean addEvent(Event event) throws IllegalArgumentException{
        if(event == null){
            throw new IllegalArgumentException();
        }
        else if (event.getName() == null|| event.getAction() == null){
            throw new IllegalArgumentException();
        }
        else if(event.getName().equals("TextMessaging") || event.getName().equals("Face2Face") || event.getName().equals("PhoneCall") || event.getName().equals("Unknown")){
            System.out.println(event);
            eventList.add(event);
            return true;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    public int getNumEvent(){
        return eventList.size();
    }

    public EventLog() {
        eventList = new ArrayList();
    }
}
