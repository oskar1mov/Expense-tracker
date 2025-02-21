package org.example.expenses_tracker.services.stats;

import org.example.expenses_tracker.DTO.GraphDTO;
import org.example.expenses_tracker.DTO.StatsDTO;

public interface StatsService {
    GraphDTO getChartData();

    StatsDTO getStats();
}
