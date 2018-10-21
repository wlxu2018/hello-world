package Chameleon_package;

public class Client {
    public static void main(String[] args){
        String filePath = "D:\\eclipse\\data.txt";
        //k-近邻的k设置
        int k = 1;
        //度量函数阈值
        double minMetric = 0.1;
         
        ChameleonTool tool = new ChameleonTool(filePath, k, minMetric);
        tool.buildCluster();
    }
}
