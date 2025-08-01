package com.tailors.dairy.repository;

import com.tailors.dairy.model.Tailor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TailorRepository extends JpaRepository<Tailor, Long> {
	Optional<Tailor> findByEmail(String email);
	Optional<Tailor> findByPhone(String phone);
	Optional<Tailor> findByShopNameContainingIgnoreCase(String shopName);
	Optional<Tailor> findbynameContainingIgnoreCase(String name);
}
