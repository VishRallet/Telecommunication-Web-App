package com.var.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.var.dto.MissedCallAlertDTO;
import com.var.entity.MissedCallAlert;
import com.var.exception.MissedCallAlertNotFoundException;
import com.var.service.MissedCallAlertService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/mca")
public class MissedCallAlertController {

    @Autowired
    MissedCallAlertService missedCallAlertService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/register")
    public ResponseEntity<String> registerMissedCall(@Valid @RequestBody MissedCallAlertDTO missedCallAlertDto) {
        MissedCallAlert missedCallAlert = modelMapper.map(missedCallAlertDto, MissedCallAlert.class);
        missedCallAlertService.addMissedCall(missedCallAlert);
        return new ResponseEntity<>("Registered for MCA service", HttpStatus.CREATED);
    }

    @GetMapping
    public List<MissedCallAlertDTO> getAllMissedCalls() {
        List<MissedCallAlert> alerts = (List<MissedCallAlert>) missedCallAlertService.getAllMissedCall();
        return alerts.stream()
                .map(alert -> modelMapper.map(alert, MissedCallAlertDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public MissedCallAlertDTO getMissedCallById(@PathVariable("id") Long id) throws MissedCallAlertNotFoundException {
        MissedCallAlert alert = missedCallAlertService.getMissedCall(id);
        return modelMapper.map(alert, MissedCallAlertDTO.class);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMissedCall(@PathVariable("id") Long id,
                                                   @Valid @RequestBody MissedCallAlertDTO missedCallAlertDto)
            throws MissedCallAlertNotFoundException {
        MissedCallAlert alert = modelMapper.map(missedCallAlertDto, MissedCallAlert.class);
        missedCallAlertService.updateMissedCallAlertNumber(id, alert);
        return ResponseEntity.ok("Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMissedCall(@PathVariable("id") Long id)
            throws MissedCallAlertNotFoundException {
        missedCallAlertService.deleteMissedCallAlertNumber(id);
        return ResponseEntity.ok("Deleted");
    }
}
