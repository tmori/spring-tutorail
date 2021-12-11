package com.example;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@RestController
public class ExampleRestController {
    @RequestMapping(value = "/api/translate", method = RequestMethod.POST)
    public ResponseTranslate postTranslate(@RequestBody String request) {
        System.out.println("ENTER: postTranslate(" + request  + ")");
        ResponseTranslate res = new ResponseTranslate();

        res.setDetectedLanguage("英語");
        res.setTranslatedLanguage("日本語");
        res.setTranslatedText(request);
        return res;
    }
    private class RequestTranslate implements Serializable {
        private static final long serialVersionUID = 1L;
        private String target;
        public String getTarget()
        {
            return this.target;
        }
        public void setTarget(String in)
        {
            this.target = in;
        }
    }
    /**
     * ブログ記事クラス
     */
    private class ResponseTranslate {
        private String detectedLanguage;
        private String translatedText;
        private String translatedLanguage;

        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }
        public String getTranslatedText() {
            return this.translatedText;
        }
        public String getTranslatedLanguage() {
            return this.translatedLanguage;
        }

        public void setDetectedLanguage(String in) {
            this.detectedLanguage = in;
        }
        public void setTranslatedText(String in) {
            this.translatedText = in;
        }
        public void setTranslatedLanguage(String in) {
            this.translatedLanguage = in;
        }

    }
}
