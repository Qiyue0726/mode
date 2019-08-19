package FactoryMethod;

/**
 * @Author: yujianhao
 * @ClassName: Consumer
 * @Description: 描述
 * @CreateDate: 2019-08-19 17:05
 */
public class Consumer {

    public static void main(String[] args){

        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.getInformation();

        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.getInformation();

    }
}
