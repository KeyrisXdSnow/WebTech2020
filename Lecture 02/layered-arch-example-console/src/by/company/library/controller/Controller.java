package by.company.library.controller;

import by.company.library.command.Command;
import by.company.library.command.exception.CommandException;
import by.company.library.service.ServiceFactory;
import by.company.library.service.UserService;

public class Controller {
	private final CommandProvider provider = new CommandProvider();
	
	
	public String doAction(String request){//"LOGINATION login=aaa password=www"
		String commandName;
		// request.split("//s+");
		// parse request and get command name
		/* stub */ commandName = "LOGINATION";
		
		/*
		 * String response; switch(commandName) { case "LOGINATION": ServiceFactory
		 * factory = ServiceFactory.getInstance(); UserService service =
		 * factory.getUserService();
		 * 
		 * boolean result = service.logination("", "");
		 * 
		 * if(result) { response = "OK"; } else { response = "eeeeeerrrrrror"; }
		 * 
		 * break; case "REGISTRATION": break;
		 * 
		 * }
		 */
		
	
		String response;
		try {
			Command command = provider.getCommand(commandName);
			response = command.execute(request);
		} catch (CommandException e) {
			// logging
			// response with error massage is formed
			/* stub */response = "error";
		}
		
		return response;
		
	}
}
