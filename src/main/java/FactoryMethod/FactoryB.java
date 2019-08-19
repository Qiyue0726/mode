package FactoryMethod;

/**
 * @Author: yujianhao
 * @ClassName: FactoryB
 * @Description: 描述
 * @CreateDate: 2019-08-19 17:04
 */
public class FactoryB implements Factory {

    public Product createProduct() {
        return new ProductB();
    }
}
