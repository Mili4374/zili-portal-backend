package com.zili.portal.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/nudge")
// We changed this from localhost to your actual Vercel URLs
@CrossOrigin(origins = {
    "https://zili-portal-frontend.vercel.app", 
    "https://zili-portal-frontend-milis-projects.vercel.app"
}, allowCredentials = "true")
public class NudgeController {

    @PostMapping
    public Map<String, String> sendNudge(@RequestBody Map<String, String> request) {
        String sender = request.get("sender");
        System.out.println("Nudge received from: " + sender);
        
        // This is the response that tells your React app "Success!"
        return Map.of(
            "status", "success", 
            "message", "Nudge sent to your partner!"
        );
    }
}