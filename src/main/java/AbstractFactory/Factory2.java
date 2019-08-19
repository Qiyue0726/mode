package AbstractFactory;

/**
 * @ClassName: Factory2
 * @Description: 生成产品A2、B2
 */
public class Factory2 implements Factory {
    public ProductA createProductA() {
        return new ProductA2();
    }

    public ProductB createProductB() {
        return new ProductB2();
    }
}
