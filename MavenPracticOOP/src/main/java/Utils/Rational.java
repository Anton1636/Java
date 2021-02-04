package Utils;

import java.math.BigInteger;

public class Rational {
    private BigInteger num;
    private BigInteger den;

    public BigInteger getNum() {
        return num;
    }

    public void setNum(BigInteger num) {
        this.num = num;
    }

    public BigInteger getDen() {
        return den;
    }

    public void setDen(BigInteger den) {
        this.den = den;
    }

    public Rational() {
    }

    public Rational(String s)
    {
        if (s.contains("/"))
        {
            String [] nd = s.split("/");
            num=new BigInteger(nd[0]);
            den=new BigInteger(nd[1]);
        }
        else
        {
            num=new BigInteger(s);
            den=new BigInteger("1");
        }
    }

    Rational(String n, String d)
    {
        BigInteger tmp=new BigInteger(n);
        if (tmp.intValue()==0)
        {
            num=new BigInteger("0");
            den=new BigInteger("1");
        }
        else
        {
            num=new BigInteger(n);
            den=new BigInteger(d);
        }
    }

    Rational(BigInteger n, BigInteger d)
    {
        num=n;
        den=d;
    }

    Rational(BigInteger n)
    {
        num=n;
        den=new BigInteger("1");
    }

    public Rational add(Rational a) {
        BigInteger n1,d1,n2,d2,nn1,nn2,nn,dd,g;
        n1=num;
        d1=den;
        n2=a.num;
        d2=a.den;
        nn1=n1.multiply(d2);
        nn2=n2.multiply(d1);
        nn =nn2.add(nn1);
        dd =d1.multiply(d2);
        g  =nn.gcd(dd);
        nn =nn.divide(g);
        dd =dd.divide(g);
        Rational r=new Rational(nn,dd);
        return r;
    }
    public Rational sub(Rational a) {
        BigInteger n1,d1,n2,d2,nn1,nn2,nn,dd,g;
        n1=num;
        d1=den;
        n2=a.num;
        d2=a.den;
        nn1=n1.multiply(d2);
        nn2=n2.multiply(d1);
        nn =nn2.subtract(nn1);
        dd =d1.multiply(d2);
        g  =nn.gcd(dd);
        nn =nn.divide(g);
        dd =dd.divide(g);
        Rational r=new Rational(nn,dd);
        return r;
    }
    public Rational mul(Rational a) {
        BigInteger n1,d1,n2,d2,nn1,nn2,nn,dd,g;
        n1=num;
        d1=den;
        n2=a.num;
        d2=a.den;
        nn1=n1.multiply(n2);
        dd =d1.multiply(d2);
        g  =nn1.gcd(dd);
        nn =nn1.divide(g);
        dd =dd.divide(g);
        Rational r=new Rational(nn,dd);
        return r;
    }

    public String toString() {
        if (num.compareTo(den)==0)
        {
            return "1";
        }
        else if (num.compareTo( new BigInteger("0"))==0)
        {
            return "0";
        }
        else
            {
            return num.toString()+"/"+den.toString();
        }
    }
}
