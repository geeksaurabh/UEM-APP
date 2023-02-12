package universityeventmanagement.UEMAPP.EventService;

import org.springframework.stereotype.Service;
import universityeventmanagement.UEMAPP.Event.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class EventService {
   static public List<Event> eventList=new ArrayList<>();
    static{
        eventList.add(new Event(1,"dancing event","lucknow","4 october","10 am morning","5 pm evening"));
        eventList.add(new Event(2,"painting event","lucknow","5 october","10 am morning","5 pm evening"));
        eventList.add(new Event(3,"singing event","lucknow","6 october","10 am morning","5 pm evening"));
        eventList.add(new Event(4,"sports event","lucknow","7 october","10 am morning","5 pm evening"));
        eventList.add(new Event(5,"science event","lucknow","8 october","10 am morning","5 pm evening"));


    }
    public List<Event> getAllEvent(){

        return eventList;
    }

    public Event findEventById(int id){
        for(Event u:eventList){
            if(u.getEventId()==id) {
                return u;
            }
    }
        return null;
    }
    public void deleteEvent(int id){
        Predicate<? super Event> predicate = user -> user.getEventId() == id;
        eventList.removeIf(predicate);
    }
    public void addEvent(Event event) {
        eventList.add(event);
    }
    public void updateEvent(int eventId,Event newEvent) {


        Event event=findEventById(eventId);


        event.setEventName(newEvent.getEventName());
        event.setLocationOfEvent(newEvent.getLocationOfEvent());
    }
}

