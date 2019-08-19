package FactoryMethod;


/**
 * @Author: yujianhao
 * @ClassName: FactoryA
 * @Description: 描述
 * @CreateDate: 2019-08-19 17:02
 */
public class FactoryA implements Factory {
    public Product createProduct() {
        return new ProductA();
    }
}
