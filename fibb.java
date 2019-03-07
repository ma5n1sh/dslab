public class fibb {
    import java.math.BigInteger;



        public static BigInteger fib( int term ){
            if(term==1){return BigInteger.valueOf(0);}
            if(term==2){return BigInteger.valueOf(1);}
            else{
                BigInteger x = new BigInteger("0");
                BigInteger y = new BigInteger("1");
                BigInteger z = new BigInteger("0");
                int i;
                for (i=0;i<term-2;i++){
                    z = x.add(y);
                    x=y.add(BigInteger.valueOf(0));
                    y=z.add(BigInteger.valueOf(0));
                }
                return z;
            }

        }


    }

