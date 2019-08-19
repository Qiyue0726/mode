package AbstractFactory;

/**
 * @Author: yujianhao
 * @ClassName: Consumer
 * @Description: 描述
 * @CreateDate: 2019-08-19 21:11
 */
public class Consumer {

    public static void main(String [] args){
        Factory1 factory1 = new Factory1();
        factory1.createProductA();
        factory1.createProductB();

        Factory2 factory2 = new Factory2();
        factory2.createProductA();
        factory2.createProductB();
    }
}
