package com.lt.note.service.impl;

import com.lt.note.service.NotesDataValidation;
import com.lt.note.service.exception.ServiceException;

public class NotesDataValidationImpl implements NotesDataValidation {

	@Override
	public boolean isContentNotEmpty(String content) throws ServiceException {

		if (content != "" & content != null) {

			return true;

		}

		throw new ServiceException("Empty content");

	}

}
