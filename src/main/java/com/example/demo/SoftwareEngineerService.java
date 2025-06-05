package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private  final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }
    public  List<SoftWareEngineer> getAllEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftWareEngineer softWareEngineer) {
        softwareEngineerRepository.save(softWareEngineer);
    }

    public SoftWareEngineer getEngineersById(Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Engineer with id " + id + " does not exist"));
    }
}
