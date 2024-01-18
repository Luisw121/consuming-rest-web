package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivesScoresController {
    private final LiveScoreService liveScoreService;

    @Autowired
    public LivesScoresController(LiveScoreService liveScoreService){
        this.liveScoreService = liveScoreService;
    }

    @GetMapping("/live-score")
    public String showLiveScores(Model model) {
        try {
            LiveScores liveScores = liveScoreService.getLiveScores();

            if (liveScores != null) {
                model.addAttribute("liveScores", liveScores.getMatches());
            } else {
                model.addAttribute("error", "No se pudieron obtener los puntajes en vivo.");
            }
        } catch (Exception e) {
            //Para anejar las excepciones si ocurren durante la obtención de puntajes en vivo
            model.addAttribute("error", "Ocurrió un error al obtener los puntajes en vivo.");
        }

        return "live-scores";
    }
}
