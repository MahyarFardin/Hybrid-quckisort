import java.util.ArrayList;

public class FindBest extends Thread{
    ArrayList<double[]> result;
    int number;

    FindBest(ArrayList<double[]> result, int number){
        this.result=result;
        this.number=number;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        double[] resultOfThisNumber= new double[2];
        resultOfThisNumber[0]=number;
        resultOfThisNumber[1]=Test.parent(number);
        result.add(resultOfThisNumber);
        super.run();
    }
}
