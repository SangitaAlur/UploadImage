package com.spring.mvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.spring.mvc.service.FileService;
import com.spring.mvc.service.ValidationService;
import org.springframework.ui.Model;

@Controller
public class FileUploadController {

	 @Autowired
	    private FileService fileService;

	    @Autowired
	    private ValidationService validationService;

	    @GetMapping("/upload")
	    public String uploadForm(Model model) {
	        return "index";
	    }

	    @PostMapping("/upload")
	    public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
	        // Handle file upload
	        ResponseEntity<String> validationResponse = validationService.validateFile(file);
	        if (validationResponse.getStatusCode().is2xxSuccessful()) {
	            fileService.saveFile(file.getOriginalFilename());
	            model.addAttribute("message", "File uploaded successfully!");
	        } else {
	            model.addAttribute("error", "File validation failed: " + validationResponse.getBody());
	        }
	        return "uploadResult";
	    }
}
