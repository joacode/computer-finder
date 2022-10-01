package com.computerFinder.computers;

import com.computerFinder.computers.domain.Computer;
import com.computerFinder.computers.domain.ComputerInsertRequest;
import com.computerFinder.computers.domain.ComputerUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/computers", produces = "application/json; charset=utf-8")
public class ComputersController {

    @Autowired
    private ComputersService computersService;

    @GetMapping
    public List<Computer> find() {
        return this.computersService.find();
    }

    @GetMapping("/{id}")
    public Computer findById(@PathVariable Long id) {
        return this.computersService.findById(id);
    }

    @PostMapping
    public void insert(@RequestBody ComputerInsertRequest request) {
        this.computersService.insert(request);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody ComputerUpdateRequest request) {
        this.computersService.update(id, request);
    }

}
