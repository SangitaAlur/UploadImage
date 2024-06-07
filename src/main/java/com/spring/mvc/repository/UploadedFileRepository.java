package com.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.entity.UploadedFile;

public interface UploadedFileRepository extends JpaRepository<UploadedFile, Long> {

}
