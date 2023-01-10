package com.lt.note.controller.comand;


import com.lt.note.controller.CommandResponse;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.service.exception.ServiceException;

public interface Command {
	
	public CommandResponse execute(String request) throws DAOException, ServiceException;

	CommandResponse saveNote(String request) throws DAOException;

}
