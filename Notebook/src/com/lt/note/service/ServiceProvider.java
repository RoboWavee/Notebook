package com.lt.note.service;

import com.lt.note.service.impl.NotesCreateServiceImpl;
import com.lt.note.service.impl.NotesDataValidationImpl;
import com.lt.note.service.impl.NotesFindServiceImpl;

public final class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	private NotesCreateService notesCreateService = new NotesCreateServiceImpl();
	private NotesFindService notesFindService = new NotesFindServiceImpl();
	private NotesDataValidation notesDataValidation = new NotesDataValidationImpl();

	private ServiceProvider() {

	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public NotesDataValidation getNotesDataValidation() {
		return notesDataValidation;
	}

	public NotesFindService getNotesFindService() {
		return notesFindService;
	}

	public NotesCreateService getNotesCreateService() {
		return notesCreateService;
	}

}
