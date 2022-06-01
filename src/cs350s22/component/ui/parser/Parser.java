package cs350s22.component.ui.parser;

import java.io.IOException;

public class Parser {
    String command;
    private A_ParserHelper _parserHelper;

    public Parser(A_ParserHelper parserHelper, String commandText){
        System.out.println("booop");
        command = commandText;
        this._parserHelper = parserHelper;
    }
    public void parse() throws IOException {
        if(command.charAt(0) == '@'){
            //Action command
            parseAction();
        }
        if(command.charAt(0) == 'c' || command.charAt(0) == 'C'){
            //Create command
            parseCreate();
        }
        if(command.charAt(0) == 's' || command.charAt(0) == 'S'){
            //Send command
            parseSend();
        }
        if(command.charAt(0) == 'b' || command.charAt(0) == 'B'){
            //Build command
            parseBuild();
        }
        if(command.equalsIgnoreCase("@exit")){
            this._parserHelper.exit();
        } else{
            System.out.println("whoopdie dooooooo");
        }
    }

    private void parseBuild() {
    }

    private void parseSend() {
    }

    private void parseCreate() {
        if(command.charAt(7) == 'A' || command.charAt(7) == 'a'){
            createActuator();
        }
        if(command.charAt(7) == 'C' || command.charAt(7) == 'c'){
            createController();
        }
        if(command.charAt(7) == 'M' || command.charAt(7) == 'm'){
            createMapper();
        }
        if(command.charAt(7) == 'N' || command.charAt(7) == 'n'){
            createNetwork();
        }
        if(command.charAt(7) == 'R' || command.charAt(7) == 'r'){
            createReporter();
        }
    }

    private void parseAction() {
    }

    public void processString(){
    }
}
