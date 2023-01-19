package com.lt.note.dal.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.lt.note.dal.NotesDAO;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.entity.Note;

public class FileNotesDAO implements NotesDAO {

	private final List<Note> notes = new ArrayList<Note>();

	private static final String FILE_NAME = "resources/note.txt";

	public FileNotesDAO() throws DAOException {

		FileReader readerNote = null;

		BufferedReader bufferReaderNote = null;

		try {

			readerNote = new FileReader(FILE_NAME);

			bufferReaderNote = new BufferedReader(readerNote);

			StringBuilder builderNote = new StringBuilder();

			String currentLineNote = bufferReaderNote.readLine();

			while (currentLineNote != null) {

				builderNote.append(currentLineNote);
				builderNote.append("n");
				currentLineNote = bufferReaderNote.readLine();

			}

			bufferReaderNote.close();

		} catch (IOException ex) {

			throw new DAOException(ex);

		}

	}

	@Override
	public void save(Note note) throws DAOException {

		notes.add(note);

		File fileNotes = new File(FILE_NAME);

		try {

			FileWriter writeNote = new FileWriter(fileNotes, true);

			BufferedWriter bufferWritterNote = new BufferedWriter(writeNote);

			bufferWritterNote.write(String.format("%1$tb %1$te, %1$tY %1$tI:%1$tM %1$Tp", note.getDate()));
			bufferWritterNote.newLine();
			bufferWritterNote.write(note.getContent());
			bufferWritterNote.newLine();
			bufferWritterNote.newLine();
			bufferWritterNote.flush();
			bufferWritterNote.close();

		} catch (IOException ex) {

			throw new DAOException(ex);
		}

	}

	@Override
	public List<Note> load() throws DAOException {

		return notes;
	}

}
