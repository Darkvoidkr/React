package com.example.demo.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.model.Employee;
@Repository
public interface Repos extends PagingAndSortingRepository<Employee, Long>{

}
