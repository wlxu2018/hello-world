package Chameleon_package;

public class Client {
    public static void main(String[] args){
        String filePath = "D:\\eclipse\\data.txt";
        //k-���ڵ�k����
        int k = 1;
        //����������ֵ
        double minMetric = 0.1;
         
        ChameleonTool tool = new ChameleonTool(filePath, k, minMetric);
        tool.buildCluster();
    }
}
