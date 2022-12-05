package pairmatching.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Crew {
    private Course course;
    private String name;

    public List<String> getNames() throws Exception{

        String path = "C:\\Users\\user\\Desktop\\jacoco-sample\\src\\main\\resources";
        //String fileNm1 = "backend-crew";
        //String fileNm2 = "frontend-crew";
        List<String> names = new ArrayList<>();
        File folder = new File(path);
        File[] fileList = folder.listFiles();
        for (File file : fileList) {
            if (file.isFile() && file.canRead()) { // 파일이 파일인지? && 읽을 수 있는지?
                // 파일 입력스트림 생성
                FileReader fileReader = new FileReader(file);
                // 입력 버퍼 생성
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                // 읽기 수행
                String line = "";
                String result = "";
                int cnt = 0;
                while ( (line=bufferedReader.readLine()) != null) { // 파일 내 문자열을 1줄씩 읽기 while
                    System.out.println(line);
                    names.add(line);
                    cnt++;
                }
                fileReader.close();
                bufferedReader.close();
            }
        }
        return names;
    }

}