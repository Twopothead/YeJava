import java.math.BigDecimal;
class Calcu{
    public static BigDecimal factorial(BigDecimal a){
        BigDecimal f= new BigDecimal(Double.valueOf(1.0));
        for(int i=1;i<=a.intValue();i++){
                BigDecimal temp =new BigDecimal(Double.valueOf(i));
                f=f.multiply(temp);
        }
        return f;
    }
    public static void main(String[] args){
        int i;
        BigDecimal sum = new BigDecimal(0);
        for( i = 1;i <= 10; i++){
            BigDecimal term=new BigDecimal(Double.valueOf(1.0));
            BigDecimal denominator =new BigDecimal(Double.valueOf(1.0*i));
            denominator = factorial(denominator);
            //System.out.println(denominator);
            term = term.divide(denominator,10,BigDecimal.ROUND_HALF_UP);
            sum =sum.add(term);
        }
        System.out.print("1+1/2!+1/3!+……+1/10!=");
        System.out.println(sum);
      }
}
