package com.devsuperior.bds02.services;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.entities.Event;
import com.devsuperior.bds02.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;


    @Transactional
    public EventDTO update(Long id, EventDTO eventDTO) throws Exception{

            Event eventEntity = eventRepository.getOne(id);

            eventEntity.setName(eventDTO.getName());
            eventEntity.setDate(eventDTO.getName());
            eventEntity.setName(eventDTO.getName());
            eventEntity.setName(eventDTO.getName());
            eventEntity = eventRepository.save(eventEntity);

            return new EventDTO(eventEntity);

        name, date, url, city_id


    }

}
