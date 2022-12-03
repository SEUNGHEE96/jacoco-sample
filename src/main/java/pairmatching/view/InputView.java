package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.message.InputMessage;

public class InputView {

    InputMessage inputMessage = new InputMessage();
    public String getMenu() {
        System.out.println(inputMessage.START_GAME);
        String menu = Console.readLine();
        return menu;
    }

}
