package com.bbi.teamSeven.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbi.teamSeven.bean.FileBean;
import com.bbi.teamSeven.entity.File;
import com.bbi.teamSeven.repository.FileRepository;

@Service
public class FileService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	FileRepository fileRepository;
	
	public FileBean getFileByCategoryService(String name,String category) {
		return modelMapper.map(fileRepository.getFileByNameAndCategory(name,category), FileBean.class);
	}
	
	public FileBean getFileByAuthorService(String name,String author) {
		return modelMapper.map(fileRepository.getFileByNameAndAuthor(name,author), FileBean.class);
	}
	
	public FileBean getFilebyDocumentTypeService(String name,String documentType) {
		return modelMapper.map(fileRepository.getFileByNameAndDocumentType(name,documentType), FileBean.class);
	}
	
	public FileBean createFile(FileBean fileBean) {
		File file = modelMapper.map(fileBean, File.class);
		File savedFile = fileRepository.save(file);
		return modelMapper.map(savedFile, FileBean.class);
	}
}
