package Instance;

/**
 * @Author: yujianhao
 * @ClassName: Singleton
 * @Description: 描述
 * @CreateDate: 2019-08-19 10:37
 */
public class Singleton {

    //私有化构造函数，使该类不会被实例化
    private Singleton(){}

    //创建Singleton的一个对象实例
    private static final Singleton instance = new Singleton();

    //获取唯一可用的对象实例
    public static Singleton getInstance(){
        return instance;
    }
}
