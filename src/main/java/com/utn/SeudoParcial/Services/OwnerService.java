package com.utn.SeudoParcial.Services;

import com.utn.SeudoParcial.Models.Owner;
import com.utn.SeudoParcial.Repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class OwnerService {

    private OwnerRepository ownerRepository;

    @Autowired
    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    public List<Owner> getAll() {
        return ownerRepository.findAll();
    }

    public void add(Owner owner) {
        ownerRepository.save(owner);
    }

    public Owner getById(Integer id) {
        return ownerRepository.findById(id).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
}
