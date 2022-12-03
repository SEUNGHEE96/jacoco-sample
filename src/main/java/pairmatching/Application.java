package pairmatching;

import pairmatching.controller.MathcingController;
import pairmatching.model.MatchingResult;

public class Application {
    static MathcingController mathcingController = new MathcingController();
    public static void main(String[] args) {
        mathcingController.start();

    }
}
