package com.zili.portal.controller;

import com.zili.portal.model.VaultLetter;
import com.zili.portal.repository.VaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vault")
// Opening the vault for your live Vercel frontend!
@CrossOrigin(origins = {
    "https://zili-portal-frontend.vercel.app", 
    "https://zili-portal-frontend-milis-projects.vercel.app"
}, allowCredentials = "true")
public class VaultController {

    @Autowired
    private VaultRepository vaultRepository;

    @GetMapping
    public List<VaultLetter> getAllLetters() {
        return vaultRepository.findAll();
    }
}