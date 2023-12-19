package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.co2103.hw1.controller.DepotValidator;
import co2103.hw1.domain.Depot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepotController {
    @GetMapping("/depots")
    public String showDepot(Model model) {
        model.addAttribute("depots", Hw1Application.depots);
        return "depots/list";
    }

    @RequestMapping("/newDepot")
    public String newDepot(Model model) {
        model.addAttribute("depot", new Depot());
        return "depots/form";
    }

    @PostMapping("/addDepot")
    public String addDepot(@ModelAttribute Depot depot, BindingResult result, Model model) {
        Hw1Application.depots.add(depot);
        return "redirect:/depots";

    }
}