package com.ayyDoubleyuEss.hiep.dang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class API {

    @Autowired
    private AmazonClients amazonClients;

    @GetMapping("/owner")
    @ResponseBody
    public String testAPI() {
        return amazonClients.S3Client().getS3AccountOwner().getDisplayName();
    }
}
