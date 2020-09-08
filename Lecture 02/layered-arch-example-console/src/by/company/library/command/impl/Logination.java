package by.company.library.command.impl;

import by.company.library.command.Command;
import by.company.library.command.exception.CommandException;

public class Logination implements Command{

	@Override
	public String execute(String request) throws CommandException {
		
		String login;
		String password;
		// parse request and get parameters
		/* stub  */ login = "asdfg";
		/* stub  */ password = "qwerty";
		
		
		
		return null;
	}

}
