package com.project.incident_response.controller;


import com.project.incident_response.model.Incident;
import com.project.incident_response.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incidents")
public class IncidentController {
    @Autowired
    private IncidentService incidentService;

    @GetMapping
    public List<Incident> getAllIncidents() {
        return incidentService.findAll();
    }

    @PostMapping
    public Incident createIncident(@RequestBody Incident incident) {
        return incidentService.save(incident);
    }
}
