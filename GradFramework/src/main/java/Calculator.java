public class Calculator {

    public int addNumbers(int a, int b) {
        return a + b;
    }
    public Long add(Integer a, Integer b, Integer... list) {
        Integer sum = 0;
        sum = a + b;
        for (Integer i : list) {
            sum = sum + i;
        }
        return sum.longValue();
    }
    public Double add(Double a, Double b, Double... list) {
        Double sum = 0.0;
        sum = a + b;
        for (Double i : list) {
            sum = sum + i;
        }
        return sum;
    }
    public Integer factorial(Integer n){
        Integer f=1;
        if (n==0 || n==1) f=1;
        for(Integer i=2;i<=n;i++){
            f*=i;}
        return f;
    }
}
