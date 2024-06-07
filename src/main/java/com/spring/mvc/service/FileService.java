package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.entity.UploadedFile;
import com.spring.mvc.repository.UploadedFileRepository;

@Service
public class FileService {

	 @Autowired
	    private UploadedFileRepository fileRepository;

	    public void saveFile(String fileName) {
	        UploadedFile file = new UploadedFile();
	        file.setFileName(fileName);
	        fileRepository.save(file);
	    }
}
