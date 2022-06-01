package cs350s22.startup;

import cs350s22.component.ui.parser.A_ParserHelper;
import cs350s22.component.ui.parser.Parser;
import cs350s22.component.ui.parser.ParserHelper;

public class Startup {
    private final A_ParserHelper _parserHelper = new ParserHelper();
    public static void main(String[] args) throws Exception {
        Startup startup = new Startup();
        startup.parse("@CONFIGURE LOG \"a.txt\" DOT SEQUENCE \"b.txt\" NETWORK \"c.txt\" XML \"d.txt\"");
        startup.parse("@exit");
    }
    public Startup() {
        System.out.println("STARTUP");
    }

    private void parse(String parse) throws Exception {
        System.out.println("PARSE> " + parse);
        Parser parser = new Parser(this._parserHelper, parse);
        parser.parse();
    }
}
