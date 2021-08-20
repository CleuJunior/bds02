package com.devsuperior.bds02.controller;


import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/events")
public class EventController {

    @Autowired
    private EventService eventService;


    @PutMapping(value = "/{id}")
    public ResponseEntity<EventDTO> update(@PathVariable Long id, @RequestBody EventDTO eventDTO)
    {
        eventDTO = eventService.update(id, eventDTO);
        return ResponseEntity.ok().body(eventDTO);
    }

}
