package com.computerFinder.computers;

import com.computerFinder.computers.domain.Computer;
import com.computerFinder.computers.domain.ComputerInsertRequest;
import com.computerFinder.computers.domain.ComputerUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputersService {

    @Autowired
    private ComputersMapper computersMapper;

    public List<Computer> find() {
        return this.computersMapper.find();
    }

    public Computer findById(Long id) {
        return this.computersMapper.findById(id);
    }

    public void insert(ComputerInsertRequest request) {
        this.computersMapper.insert(request);
    }

    public void update(Long id, ComputerUpdateRequest request) {
        this.computersMapper.update(id, request);
    }

}
