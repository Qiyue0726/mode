package Instance;

/**
 * @Author: yujianhao
 * @ClassName: Singleton3
 * @Description: 描述
 * @CreateDate: 2019-08-19 11:39
 */
public class Singleton3 {

    private Singleton3(){};

    public static class SingletonHolder {
        private static final Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.instance;
    }
}
