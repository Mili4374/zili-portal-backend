package com.zili.portal.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class VaultLetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title; // e.g., "Open when you miss me"
    
    @Column(columnDefinition = "TEXT")
    private String content;
    
    private LocalDate unlockDate; // The date this becomes viewable
    private boolean isOpened = false;
}