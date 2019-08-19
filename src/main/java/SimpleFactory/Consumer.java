package SimpleFactory;

/**
 * @Author: yujianhao
 * @ClassName: Consumer
 * @Description: 描述
 * @CreateDate: 2019-08-19 16:01
 */
public class Consumer {

    public static void main (String args[]) {
        Product productA = Factory.createProduct('A');
        productA.getInformation();

        Product productB = Factory.createProduct('B');
        productB.getInformation();

        //不存在C产品,会空指针报错
        Product productC = Factory.createProduct('C');
        productC.getInformation();
    }
}
