package com.bbi.teamSeven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbi.teamSeven.bean.FileBean;
import com.bbi.teamSeven.service.FileService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FileController {
	
	@Autowired
	FileService fileService;
	
	@GetMapping("/getfileByCategory")
	public ResponseEntity<FileBean> getFileByCategory(@RequestParam(required = false, name = "name") String name,@RequestParam(required = false, name = "category") String category ){
		return new ResponseEntity<FileBean>(fileService.getFileByCategoryService(name,category),HttpStatus.OK);
	}
	
	@GetMapping("/getfileByAuthor")
	public ResponseEntity<FileBean> getFileByAuthor(@RequestParam(required = false, name = "name") String name,@RequestParam(required = false, name = "category") String author ){
		return new ResponseEntity<FileBean>(fileService.getFileByAuthorService(name,author),HttpStatus.OK);
	}
	
	@GetMapping("/getfileDocumentType")
	public ResponseEntity<FileBean> getFilebyDocumentType(@RequestParam(required = false, name = "name") String name,@RequestParam(required = false, name = "category") String documentType ){
		return new ResponseEntity<FileBean>(fileService.getFilebyDocumentTypeService(name,documentType),HttpStatus.OK);
	}
	
	@PostMapping("/createfile")
	public ResponseEntity<FileBean> createFile(@RequestBody FileBean fileBean){
		return new ResponseEntity<FileBean>(fileService.createFile(fileBean),HttpStatus.CREATED);
	}
}
