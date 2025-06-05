package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/engineer-data")
public class SoftwareEngineerController {
   public final SoftwareEngineerService softwareEngineerService;
    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }
    @GetMapping()
    public List<SoftWareEngineer>getEngineers(){
        return softwareEngineerService.getAllEngineers();
    }

    @GetMapping("{id}")
    public SoftWareEngineer getEngineersById(@PathVariable Integer id){
        return softwareEngineerService.getEngineersById(id);
    }

    @PostMapping
    public void addEngineer(@RequestBody SoftWareEngineer softWareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softWareEngineer);
    }

}
