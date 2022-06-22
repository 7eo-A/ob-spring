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
    private LaptopRepository laptop;

    public LaptopController(LaptopRepository laptop) {
        this.laptop = laptop;
    }

    /**
     * @method getListAll: get all laptops
     * @return List<Laptop>
     */
    @GetMapping("/api/laptop/getList")
    public List<Laptop> getListAll() {
        return laptop.findAll();
    }

}
