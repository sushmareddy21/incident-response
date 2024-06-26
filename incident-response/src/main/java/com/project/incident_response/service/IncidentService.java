package com.project.incident_response.service;



import com.project.incident_response.model.Incident;
import com.project.incident_response.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentService {
    @Autowired
    private IncidentRepository incidentRepository;

    public List<Incident> findAll() {
        return incidentRepository.findAll();
    }

    public Incident save(Incident incident) {
        return incidentRepository.save(incident);
    }
}
