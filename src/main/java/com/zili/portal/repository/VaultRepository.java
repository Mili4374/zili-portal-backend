package com.zili.portal.repository;

import com.zili.portal.model.VaultLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaultRepository extends JpaRepository<VaultLetter, Long> {
}