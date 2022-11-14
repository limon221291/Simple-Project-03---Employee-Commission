public class Employee {
    double workingHours;
    double basicWage;
    double totalSales;

    public void setInfo(double workingHours, double basicWage,double totalSales){
        this.workingHours=workingHours;
        this.basicWage=basicWage;
        this.totalSales=totalSales;
    }

    public void printWage(){
        double commission=0;
        if(this.totalSales>=1.00 && this.totalSales<=99.99){
            commission+= 0.05;
        }
        else if(this.totalSales>=100.00 && this.totalSales<=299.99){
            commission+= 0.1;
        }
        else if(this.totalSales>=300.00){
            commission+= 0.15;
        }
        System.out.println((commission*this.totalSales)+(this.workingHours*this.basicWage));
    }
}
