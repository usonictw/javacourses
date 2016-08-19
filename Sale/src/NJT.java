/**
 * Created by PC on ${DATA}.
 */
public class NJT extends Tax {

    public double adjustForStudent(double tax){
        return tax-500;
    }

    public double calcTax(){

        if(grossIncome<50000){
            return grossIncome*0.10;
        }
        else{
            return grossIncome*0.13;
        }

    }
}
