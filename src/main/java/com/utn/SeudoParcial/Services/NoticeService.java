package com.utn.SeudoParcial.Services;

import com.utn.SeudoParcial.Models.Notice;
import com.utn.SeudoParcial.Repositories.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class NoticeService {

    private NoticeRepository noticeRepository;

    @Autowired
    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public List<Notice> getAll() {
        return noticeRepository.findAll();
    }

    public void add(Notice notice) {
        noticeRepository.save(notice);
    }

    public Notice getById(Integer id) {
        return noticeRepository.findById(id).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
}
