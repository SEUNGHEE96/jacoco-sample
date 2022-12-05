package pairmatching.controller;

import pairmatching.model.Course;
import pairmatching.view.InputView;

public class MathcingController {
    InputView inputView = new InputView();
    public void start() {
        inputView.getMenu();
        inputView.getScenarios();

    }

}
