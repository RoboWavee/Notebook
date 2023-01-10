package com.lt.note.controller.comand.impl;

import com.lt.note.controller.CommandResponse;
import com.lt.note.controller.comand.Command;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.service.exception.ServiceException;

public class WrongRequest implements Command {
	
	
	@Override
	public CommandResponse execute (String request) throws DAOException, ServiceException {
		
		return new CommandResponse ("Request error");
	}
	


	

}
