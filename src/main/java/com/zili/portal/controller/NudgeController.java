package com.zili.portal.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/nudge")
@CrossOrigin(origins = "http://localhost:5173")
public class NudgeController {

    @PostMapping
    public Map<String, String> sendNudge(@RequestBody Map<String, String> request) {
        String sender = request.get("sender");
        System.out.println("Nudge received from: " + sender);
        return Map.of("status", "success", "message", "Nudge sent to your partner!");
    }
}