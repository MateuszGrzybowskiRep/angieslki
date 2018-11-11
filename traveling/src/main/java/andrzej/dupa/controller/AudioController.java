package andrzej.dupa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AudioController {

    @PostMapping("/record")
    public void saveAudio(@RequestParam("file") MultipartFile multipartFile){


        System.out.printf(";;");

    }
}
