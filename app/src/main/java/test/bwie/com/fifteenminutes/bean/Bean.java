package test.bwie.com.fifteenminutes.bean;

/**
 * 类的用途：
 *
 * @author HP
 * @date 2017/11/2 10 58
 */

public class Bean {
    private String name;
    private int tp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public Bean(String name, int tp) {

        this.name = name;
        this.tp = tp;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", tp=" + tp +
                '}';
    }
}
