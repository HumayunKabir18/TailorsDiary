package com.tailors.dairy.service;

import com.tailors.dairy.model.Tailor;
import com.tailors.dairy.repository.TailorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TailorService {
	@Autowired
	TailorRepository tailorRepository;

	public Tailor registerTailor(Tailor tailor){
		return tailorRepository.save(tailor);
	}

	public boolean isPhonTaken(String phone){
		return tailorRepository.findByPhone(phone).isPresent();
	}

}
