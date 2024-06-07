package com.spring.mvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class UploadedFile {
        @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
        private String fileName;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
        public UploadedFile() {
        	
        }
		@Override
		public String toString() {
			return "UploadedFile [id=" + id + ", fileName=" + fileName + "]";
		}
		public UploadedFile(Long id, String fileName) {
			super();
			this.id = id;
			this.fileName = fileName;
		}
        

	    
}
