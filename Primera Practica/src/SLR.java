public class SLR {
    private double beta0;
    private double beta1;
    private DataSet dataSet;
    private DiscreteMaths discreteMaths;
    private double n = 9;
    public SLR(DataSet dataSet, DiscreteMaths discreteMaths){
        beta0 = 0;
        beta1 = 0;

        this.dataSet = dataSet;
        this.discreteMaths = discreteMaths;
    }


    public void calculateIntersection(){
        // beta = ...
        System.out.println("B0: " + pendiente());
        System.out.println("B1: " + punto_intercetion());

    }

    private double pendiente(){
        beta0 = (n*(discreteMaths.sumXY(dataSet.getX(), dataSet.getY()))-(discreteMaths.sumX(dataSet.getX()))*(discreteMaths.sumY(dataSet.getY())))/(n*(discreteMaths.SumacuadradoX(dataSet.getX()))-(discreteMaths.sumX(dataSet.getX())*discreteMaths.sumX(dataSet.getX())));
        return  beta0;

    }

    public void prediction(double x){
        double t = (beta1 + (beta0 * x));
        System.out.println("Prediction: " + t);

    }

    private double  punto_intercetion(){
        beta1 =(discreteMaths.sumY(dataSet.getY())-(beta0* discreteMaths.sumX(dataSet.getX())))/n;
        return beta1;
    }


    public void calculateSlope(){
        // beta1 = ...
        System.out.println(discreteMaths.sumX(dataSet.getX()));
        System.out.println(discreteMaths.sumY(dataSet.getY()));
    }
}

