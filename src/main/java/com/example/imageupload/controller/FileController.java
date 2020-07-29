/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.imageupload.controller;

import com.example.imageupload.model.FileTable;
import com.example.imageupload.repo.FileRepository;
import com.example.imageupload.service.CloudinaryService;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Adewole
 */
@RestController
public class FileController {
    
    
    @Autowired
    private CloudinaryService cloudinaryService;
    
   

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        String url = cloudinaryService.uploadFile(file);
        
        
        FileTable ft = new FileTable();
        ft.setName(url);
        cloudinaryService.saveResponse(ft); 
        
        return "File uploaded successfully: File path :  " + url;
    }
}
