package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Bus;
import co2103.hw1.domain.Depot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import co2103.hw1.co2103.hw1.controller.BusValidator;

import java.util.List;

@Controller
public class BusController {
    @GetMapping("/buses")
    public String showBus(@RequestParam("depot") int depotId, Model model) {
        Depot depot = findDepot(depotId);
        if (depot != null) {
            model.addAttribute("buses", depot.getBuses());
            model.addAttribute("depotId", depotId);
            return "buses/list";
        } else {
            return "error";
        }
    }

    @RequestMapping("/newBus")
    public String newBus(@RequestParam("depot") int depotId, Model model) {
        Bus newBus = new Bus();
        model.addAttribute("bus", newBus);
        model.addAttribute("depotId", depotId);
        return "buses/form";
    }

    @PostMapping("/addBus")
    public String addBus(@RequestParam("depot") int depotId, @ModelAttribute Bus bus) {
        Depot depot = findDepot(depotId);
        if (depot != null) {
            List<Bus> buses = depot.getBuses();
            buses.add(bus);
            return "redirect:/depots";
        } else {
            return "error";
        }
    }

    private Depot findDepot(int depotId) {
        for (Depot depot : Hw1Application.depots) {
            if (depot.getId() == depotId) {
                return depot;
            }
        }
        return null;
    }
}




