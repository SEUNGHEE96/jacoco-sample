package pairmatching.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

}