package Instance;

/**
 * @Author: yujianhao
 * @ClassName: Singleton2
 * @Description: 描述
 * @CreateDate: 2019-08-19 10:51
 */
public class Singleton2 {

    private Singleton2(){};

    private static Singleton2 instance = null;

    public static Singleton2 getInstance(){
        if (instance == null){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
