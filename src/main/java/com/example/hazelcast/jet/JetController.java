package com.example.hazelcast.jet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/data")
public class JetController {

    private final JetService jetService;

    @Autowired
    public JetController(JetService jetService) {
        this.jetService = jetService;
    }

    @PostMapping("/submit")
    public String submitData(@RequestBody Map<String, String> data) {
        // Convert the incoming data into a stream of map entries
        jetService.submitData("my-map", data.entrySet().stream());
        return "Data submitted successfully!";
    }
}
