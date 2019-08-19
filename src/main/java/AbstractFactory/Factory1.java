package AbstractFactory;

/**
 * @ClassName: FactoryA
 * @Description: 生成产品A1、B1
 */
public class Factory1 implements Factory {
    public ProductA createProductA() {
        return new ProductA1();
    }

    public ProductB createProductB() {
        return new ProductB1();
    }
}
