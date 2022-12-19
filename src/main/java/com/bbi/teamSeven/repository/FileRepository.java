package com.bbi.teamSeven.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbi.teamSeven.entity.File;

public interface FileRepository extends JpaRepository<File, Long>{

	public List<File> getFileByNameContainingAndCategory(String name,String category);
	
	public File getFileByNameAndAuthor(String name,String category);
	
	public File getFileByNameAndDocumentType(String name,String category);
	
	public List<File> getFileByNameContaining(String name);

}
