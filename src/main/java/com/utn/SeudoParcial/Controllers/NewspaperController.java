package com.utn.SeudoParcial.Controllers;

import com.utn.SeudoParcial.Models.Newspaper;
import com.utn.SeudoParcial.Services.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newspaper")
public class NewspaperController {

    @Autowired
    private NewspaperService newspapepService;

    @GetMapping("/")
    public List<Newspaper> getAll(){
        return newspapepService.getAll();
    }

    @GetMapping("/{id}")
    public Newspaper getById(@PathVariable Integer id){
        return newspapepService.getById(id);
    }

    @PostMapping("/")
    public void add(@RequestBody Newspaper newspaper){
        newspapepService.add(newspaper);
    }

}
