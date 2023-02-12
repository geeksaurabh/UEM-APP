package universityeventmanagement.UEMAPP.EventController;

import org.springframework.web.bind.annotation.*;
import universityeventmanagement.UEMAPP.Event.Event;
import universityeventmanagement.UEMAPP.EventService.EventService;

import java.util.List;

import static universityeventmanagement.UEMAPP.EventService.EventService.eventList;

@RestController
@RequestMapping("app/v1")
public class EventController {
    private  final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

     @GetMapping("find-all-event")
    public List<Event> findAllEvent(){
        return eventService.getAllEvent();
    }
    @GetMapping("find-by-id/{id}")
    public Event  findEventById(@PathVariable int id) {
        return eventService.findEventById(id);
    }



    @DeleteMapping("delete-event-id/{id}")
    public void deleteEvent(@PathVariable int id){
        eventService.deleteEvent(id);
    }
    @PostMapping("add-event")
    public void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }
     @PutMapping("update-event/{id}")
    public void updateEvent(@PathVariable int id,@RequestBody Event event) {
        eventService.updateEvent(id,event);
    }
    }

