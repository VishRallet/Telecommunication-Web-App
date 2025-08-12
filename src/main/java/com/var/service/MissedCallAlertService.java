package com.var.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.var.entity.MissedCallAlert;

import com.var.exception.MissedCallAlertNotFoundException;
import com.var.repository.MissedCallAlertRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MissedCallAlertService {
	@Autowired
	MissedCallAlertRepository missedCallAlertRepository;
	
	public void addMissedCall(MissedCallAlert missedCallAlert) {
		missedCallAlertRepository.save(missedCallAlert);
	}
	
	public MissedCallAlert getMissedCall(Long id) throws MissedCallAlertNotFoundException {
		return missedCallAlertRepository.findById(id)
				.orElseThrow(() -> new MissedCallAlertNotFoundException("MissedCallAlert with ID " + id + " not found"));
	}
	
	public Iterable<MissedCallAlert> getAllMissedCall() {
		return missedCallAlertRepository.findAll();
	}
	
	public void updateMissedCallAlertNumber(Long id, MissedCallAlert missedCallAlert) throws MissedCallAlertNotFoundException {
		if (!missedCallAlertRepository.existsById(id)) {
			throw new MissedCallAlertNotFoundException("MissedCallAlert with ID " + id + " not found");
		}
		missedCallAlert.setId(id);
		missedCallAlertRepository.save(missedCallAlert);
	}
	
	public void deleteMissedCallAlertNumber(Long id) throws MissedCallAlertNotFoundException {
		if (!missedCallAlertRepository.existsById(id)) {
			throw new MissedCallAlertNotFoundException("MissedCallAlert with ID " + id + " not found");
		}
		missedCallAlertRepository.deleteById(id);
	}
}