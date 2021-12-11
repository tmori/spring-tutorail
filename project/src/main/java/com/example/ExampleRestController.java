package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {
    @RequestMapping(value = "/latest", method = RequestMethod.GET)
    public Entry getLatestEntry() {
        System.out.println("ENTER: getLatestEntry()");
        Entry entryData = new Entry();

        entryData.setTitle("VueRouterを使ってみた");
        entryData.setContent("VueRouterで簡単にページルーティングができました");
        return entryData;
    }
    /**
     * ブログ記事クラス
     */
    private class Entry{
        private String title;
        private String content;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
