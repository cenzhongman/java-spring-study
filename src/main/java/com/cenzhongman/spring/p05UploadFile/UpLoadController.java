package com.cenzhongman.spring.p05UploadFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UpLoadController {

    @RequestMapping("/")
    public String index(){
        return "uploadForm";
    }

    @RequestMapping("/fileUpLoad.action")
    @ResponseBody
    public String upLoadFile(MultipartFile file) throws IllegalStateException, IOException {
        BufferedOutputStream stream = null;
        if (!file.isEmpty()) {
            System.out.println(file.getOriginalFilename());
            String path = "c:/other";
            File newFile = new File(path + "/" + file.getOriginalFilename());
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
            out.write(file.getBytes());
            out.flush();
            out.close();
            return "上传成功";
        }
        return "上传失败";
    }
}
