package SimpleFactory;

/**
 * @Author: yujianhao
 * @ClassName: Factory
 * @Description: 描述
 * @CreateDate: 2019-08-19 15:52
 */
public class Factory {


    public static Product createProduct(char type) {
        switch (type){
            case 'A':
                return new ProductA();
            case 'B':
                return new ProductB();
            default:
                System.out.println("没有该产品！");
                return null;
        }
    }
}
