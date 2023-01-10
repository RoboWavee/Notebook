package com.lt.note.main;


import java.time.LocalDateTime;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.dal.impl.FileNotesDAO;
import com.lt.note.entity.Note;


public class Main {

	public static void main(String[] args) throws DAOException {


		FileNotesDAO notes = new FileNotesDAO();
		
		LocalDateTime now = LocalDateTime.now();
		
		Note note1 = new Note(now, "It was a bright cold day in April, and the clocks were striking thirteen");
		Note note2 = new Note(now, "Outside, even through the shut window-pane, the world looked cold");
		Note note3 = new Note(now, "The patrols did not matter, however. Only the Thought Police mattered");
		Note note4 = new Note(now, "The blackmoustachio’d face gazed down from every commanding corner");
		
		
		notes.save(note1);
		notes.save(note2);
		notes.save(note3);
		notes.save(note4);
		
		
		
		System.out.println(notes.load());
		

	}

}
