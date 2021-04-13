package com.utn.SeudoParcial.Controllers;

import com.utn.SeudoParcial.Models.Notice;
import com.utn.SeudoParcial.Services.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("/")
    public List<Notice> getAll(){
        return noticeService.getAll();
    }

    @GetMapping("/{id}")
    public Notice getById(@PathVariable Integer id){
        return noticeService.getById(id);
    }

    @PostMapping("/")
    public void add(@RequestBody Notice notice){
        noticeService.add(notice);
    }



}
