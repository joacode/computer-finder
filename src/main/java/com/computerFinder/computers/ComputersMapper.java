package com.computerFinder.computers;

import com.computerFinder.computers.domain.Computer;
import com.computerFinder.computers.domain.ComputerInsertRequest;
import com.computerFinder.computers.domain.ComputerUpdateRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComputersMapper {
    List<Computer> find();

    Computer findById(Long id);

    void insert(ComputerInsertRequest params);

    void update(Long id, ComputerUpdateRequest params);
}
