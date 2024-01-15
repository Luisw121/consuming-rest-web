package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class LivesScoresController {
    private final LiveScoreService liveScoreService;

    @Autowired
    public LivesScoresController(LiveScoreService liveScoreService){
        this.liveScoreService = liveScoreService;
    }

    @GetMapping("/live-score")
    public String showLiveScores(Model model) {
        LiveScores liveScores = liveScoreService.getLiveScores();
        model.addAttribute("liveScores", liveScores);
        return "live-scores";
    }
}
