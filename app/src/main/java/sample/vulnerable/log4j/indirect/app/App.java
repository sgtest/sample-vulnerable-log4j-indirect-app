package sample.vulnerable.log4j.indirect.app;

import sample.vulnerable.log4j.direct.lib.Library;

public class App {
    public static void main(String[] args) {
		Library lib = new Library();
		lib.log(args);
    }
}
