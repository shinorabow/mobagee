package jtp.c.dendai.ac.jp.adventure.scene;
import java.util.Random;

import jtp.c.dendai.ac.jp.adventure.R;

public class AniY1 extends AbstractScene {
    @Override
    public GameState next(int no) {
        Random ran = new Random();
        int n = ran.nextInt(3);
        switch(n){
            case 0:
                return GameState.aniY2;
            case 1:
                return GameState.aniY3;
            case 2:
                return GameState.aniY4;
        }
        return null;
    }
    @Override
    public int getImageId() {
        return R.drawable.first;
    }
    @Override
    public int getMessageId() {
        return R.array.message_aniY1;
    }
    @Override
    public int getQuestionId() {
        return 0;
    }
    @Override
    public int getDateId() {
        return R.string.date3;
    }
    @Override
    public int getMusicId() { return R.raw.daily;}
    @Override
    public String getSceneName() { return "AniY1";}
}