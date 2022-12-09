package pairmatching.controller;

import pairmatching.model.Course;
import pairmatching.model.Crew;
import pairmatching.view.InputView;

public class MathcingController {
    InputView inputView = new InputView();
    Crew crew = new Crew();
    public void start() {
        crew.getNames();
        String menu = inputView.getMenu();
        while(true){
            if(menu.equals("1")){
                inputView.getScenarios();
            } else if(menu.equals("2")){
                inputView.getScenarios();
            } else if(menu.equals("3")){

            } else if(menu.equals("Q")){
                break;
            }
        }
    }

}
