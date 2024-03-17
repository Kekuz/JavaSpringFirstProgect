package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music musicBean = contest.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        musicPlayer.playMusic();
        contest.close();
    }
}
