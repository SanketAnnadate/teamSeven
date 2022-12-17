package com.bbi.teamSeven.service;

import com.bbi.teamSeven.bean.FileBean;

public interface FileServiceInterface {

	public FileBean getFileByCategoryService(String name,String category);
	public FileBean getFileByAuthorService(String name,String author);
	public FileBean getFilebyDocumentTypeService(String name,String documentType);
	public FileBean createFile(FileBean fileBean);
}
