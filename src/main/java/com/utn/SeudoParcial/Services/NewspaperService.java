package com.utn.SeudoParcial.Services;

import com.utn.SeudoParcial.Models.Newspaper;
import com.utn.SeudoParcial.Repositories.NewspaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class NewspaperService {

    private NewspaperRepository newspaperRepository;

    @Autowired
    public NewspaperService(NewspaperRepository newspaperRepository) {
        this.newspaperRepository = newspaperRepository;
    }

    public List<Newspaper> getAll() {
        return  newspaperRepository.findAll();
    }

    public void add(Newspaper newspaper) {
        newspaperRepository.save(newspaper);
    }

    public Newspaper getById(Integer id) {
        return newspaperRepository.findById(id).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
}
