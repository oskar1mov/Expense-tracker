package org.example.expenses_tracker.controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.example.expenses_tracker.DTO.GraphDTO;
import org.example.expenses_tracker.services.stats.StatsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
@CrossOrigin("*")
public class StatsController {
    private final StatsService statsService;

    @GetMapping("/chart")
    public ResponseEntity<GraphDTO> getChartData(){
        return ResponseEntity.ok(statsService.getChartData());
    }

    @GetMapping
    public ResponseEntity<?> getStats()
    {
        return ResponseEntity.ok(statsService.getStats());
    }

}
