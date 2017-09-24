package jtp.c.dendai.ac.jp.adventure.scene;
import jtp.c.dendai.ac.jp.adventure.R;

public class FreX2 extends AbstractScene {
    @Override
    public GameState next(int no) {
        Setsta(5);

        return null;
    }
    @Override
    public int getImageId() {
        return R.drawable.ending_s;
    }
    @Override
    public int getMessageId() {
        return R.array.message_freX2;
    }
    @Override
    public int getQuestionId() {
        return 0;
    }
    @Override
    public int getDateId() {
        return R.string.dateending;
    }
    @Override
    public int getMusicId() { return R.raw.goodend;}
    @Override
    public String getSceneName() { return "FreX2";}
}