package com.lt.note.service;

import com.lt.note.service.exception.ServiceException;

public interface NotesDataValidation {

	boolean isContentNotEmpty(String content) throws ServiceException;

}
