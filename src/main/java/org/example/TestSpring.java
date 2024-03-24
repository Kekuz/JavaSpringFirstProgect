package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        MusicPlayer musicPlayer = contest.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        contest.close();
    }
}
