package com.amazon.amazonproject.Repositorypack;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazon.amazonproject.ModelPack.CustomerReg;

@Repository
public interface crudoperations extends CrudRepository<CustomerReg, String>
{

}
