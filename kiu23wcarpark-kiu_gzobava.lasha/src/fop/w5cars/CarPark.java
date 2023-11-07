package fop.w5cars;

public class CarPark {
	// TODO
    Car[] spaces;

    public CarPark(int n){
        this.spaces = new Car[n];
    }

    public int park(Car c){
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] == null){
                c = this.spaces[i];
                return i;
            }
        }
    return -1;
    }

    public int search(LicensePlate lp){
        for (int i = 0; i < spaces.length; i++) {
            if (this.spaces[i] != null && this.spaces[i].licensePlate.isEqual(lp))
                return i;
        }
        return -1;
    }

    public Car driveOff(LicensePlate lp){
        int num = this.search(lp);

        if (num != -1){
            Car ThisCar = this.spaces[num];
            this.spaces[num] = null;
            return  this.spaces[num];
       }
    return null;
    }
    public String toString(){
        String x = "Car Park:\n";
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] == null){
                return x += (i + ":" + "[]" + "\n");
            }
            else {
                x += (i + ":" + "[" + this.spaces[i].toString() + "]" + "\n");
            }


        }
        return x;
    }

}