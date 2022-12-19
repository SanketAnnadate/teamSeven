package com.bbi.teamSeven.service;

import java.util.List;

import com.bbi.teamSeven.bean.FileBean;

public interface FileServiceInterface {

	public List <FileBean> getFileByCategoryService(String name,String category);
	public FileBean getFileByAuthorService(String name,String author);
	public FileBean getFilebyDocumentTypeService(String name,String documentType);
	public FileBean createFile(FileBean fileBean);
	List<FileBean> getFile(String name);
}
