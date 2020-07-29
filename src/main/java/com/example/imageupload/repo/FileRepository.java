/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.imageupload.repo;

import com.example.imageupload.model.FileTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Adewole
 */
@Repository
public interface FileRepository extends JpaRepository<FileTable, Integer>{
    
}
