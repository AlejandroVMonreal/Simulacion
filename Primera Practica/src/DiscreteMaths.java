
public class DiscreteMaths {

    public double sumX(double x[]){
        float totalX = 0;
        for(int i = 0; i < x.length; i++) totalX += x[i];
        return totalX;
    }

    public double sumY(double y[]){
        float totalY = 0;
        for(int i = 0; i < y.length; i++)
            totalY +=  y[i];
        return  totalY;
    }
    public double SumacuadradoX(double[] x) {
        double totalcuadrado = 0;
        for (int i = 0; i < x.length; i++)
            totalcuadrado += (Math.pow(x[i],2));

        return totalcuadrado;
    }
    public double sumXY(double[] x, double[] y){

        double totalXY = 0;
        for (int i = 0; i < x.length; i++)
            totalXY += (x[i] * y[i]);

        return totalXY;
    }
    public double B0( float n, double x[], double y[]){

        double ResB0 = 0;
        return ResB0 =(((n * sumXY(x,y))) - (sumX(x)*sumY(y))) / ((n * SumacuadradoX(x)) - (Math.pow(sumX(x), 2)));
    }
    public double B1(  float n, double x[], double y[]){

        double ResB1 = 0;
        return ResB1 = (sumY(y) - (B0(n,x,y) *  sumX(x))) / n;
    }

    public void print(){

    }
}