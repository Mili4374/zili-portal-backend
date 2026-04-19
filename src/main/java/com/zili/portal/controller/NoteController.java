package com.zili.portal.controller;

import com.zili.portal.model.Note;
import com.zili.portal.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
// Updated to allow your live Vercel site to fetch and post notes
@CrossOrigin(origins = {
    "https://zili-portal-frontend.vercel.app", 
    "https://zili-portal-frontend-milis-projects.vercel.app"
}, allowCredentials = "true") 
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAllByOrderByCreatedAtDesc();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }
}