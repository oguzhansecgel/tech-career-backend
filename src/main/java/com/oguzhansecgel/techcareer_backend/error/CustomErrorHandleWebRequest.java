package com.oguzhansecgel.techcareer_backend.error;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
//@RequiredArgsConstructor
@RestController
@CrossOrigin
public class CustomErrorHandleWebRequest implements ErrorController {

    private final ErrorAttributes errorAttributes;

    public CustomErrorHandleWebRequest(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }
}
