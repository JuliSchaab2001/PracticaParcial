package com.utn.SeudoParcial.Controllers;

import com.sun.imageio.plugins.jpeg.JPEGImageReaderSpi;
import com.utn.SeudoParcial.Models.Owner;
import com.utn.SeudoParcial.Services.OwnerService;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/")
    public List<Owner> getAll(){
        return ownerService.getAll();
    }

    @PostMapping("/")
    public void add(@RequestBody Owner owner){
        ownerService.add(owner);
    }

    @GetMapping("/{id}")
    public Owner getById(@PathVariable Integer id){
        return ownerService.getById(id);
    }

    @PutMapping("/{ownerId}/notice/{noticeId}")
    public void addNoticeToOwner(@PathVariable Integer ownerId, @PathVariable Integer noticeId){
        ownerService.addNoticeToOwner(ownerId, noticeId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        ownerService.delete(id);
    }

}
