package com.code.obspring.controller;

import com.code.obspring.entity.Laptop;
import com.code.obspring.repository.LaptopRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class LaptopController {

    /**
     *
     * @param LaptopRepository
     */
    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    /**
     *
     * @method getListAll: get all laptops
     * @return List<Laptop>
     */
    @GetMapping("/api/laptop/getList")
    public List<Laptop> getListAll() {
        return laptopRepository.findAll();
    }

    /**
     *
     * @method add: add a new laptop
     */
    @PostMapping("/api/laptop/add")
    public void add(@RequestBody Laptop laptop) {
        laptopRepository.save(laptop);
    }

}
