package weka.classifiers.neural.common.transfer;

/**
 * <p>Title: Weka Neural Implementation</p>
 * <p>Description: ...</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: N/A</p>
 * @author Jason Brownlee
 * @version 1.0
 */

public class StepTransferFunction extends TransferFunction
{
    public final static double THRESHOLD = 0.0;

    public final static double MAX = +1.0;
    public final static double MIN =  0.0;




    public double transfer(double activation)
    {
       if(activation <= THRESHOLD)
       {
           return MIN;
       }

       // > 0.0
       return MAX;
    }

    public double derivative(double activation, double transferred)
    {
        //derivative is the Dirac delta function

        if(transferred == 0.0)
        {
            return Double.POSITIVE_INFINITY;
        }

        return 0.0;
    }

    public double getMaximum()
    {
        return MAX;
    }

    public double getMinimum()
    {
        return MIN;
    }
}