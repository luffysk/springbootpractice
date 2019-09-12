package com.xxx.integrate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class FileUploadController {
    @PostMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile uploadfile, HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath("/uploadFile");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String format = sdf.format(new Date());
        File folder = new File(path + format);
        if(!folder.isDirectory()){
            folder.mkdirs();
        }
        String oldName = uploadfile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName;
        try {
            uploadfile.transferTo(new File(folder, newName));
            String filePath = request.getScheme() + "://" + request.getServerName()+":" + request.getServerPort()+"/uploadFile"+
                    format+newName;
            return filePath;
        }catch(Exception e){
            return "上传失败";
        }
    }
}
