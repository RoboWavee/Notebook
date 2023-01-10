package com.lt.note.service;

import java.time.LocalDateTime;
import java.util.List;

import com.lt.note.entity.Note;
import com.lt.note.service.exception.ServiceException;

public interface NotesFindService {
	
	List<Note> findByContent(String content) throws ServiceException;
	
	List<Note> findByDate(LocalDateTime date) throws ServiceException;

	
}
