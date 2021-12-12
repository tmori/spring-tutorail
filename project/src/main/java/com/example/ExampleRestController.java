package com.example;

import com.baitando.openapi.samples.gen.springbootserver.api.ApiApi;
import com.baitando.openapi.samples.gen.springbootserver.model.TranslationRequestDto;
import com.baitando.openapi.samples.gen.springbootserver.model.TranslationResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ExampleRestController implements ApiApi {
    @Override
    public  ResponseEntity<TranslationResponseDto> postTranslation(TranslationRequestDto translationRequestDto) {
        System.out.println("postTranslation(" + translationRequestDto.getTarget() + ")");
        TranslationResponseDto body = new TranslationResponseDto();
        ResponseEntity<TranslationResponseDto> res = new ResponseEntity<TranslationResponseDto>(body, HttpStatus.OK);
        res.getBody().setDetectedLanguage("日本語");
        res.getBody().setTranslatedLanguage("英語");
        res.getBody().setTranslatedText(translationRequestDto.getTarget());
        return res;
    }
}