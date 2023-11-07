package fop.w5cars;

import java.util.Objects;

public class LicensePlate {
	// TODO
    String regionalCode;
    String letters;
    Integer digits;

    public LicensePlate(String regionalCode, String letters, Integer digits){
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    public  boolean isEqual(LicensePlate other){
        boolean regionalsEqual = this.regionalCode.equals(other.regionalCode);
        boolean digitsEqual = this.digits.equals(other.digits);
        boolean lettersEquals = this.letters.equals(other.letters);

        return regionalsEqual && digitsEqual && lettersEquals;

    }

    public String toString(){
        return "LicensePlate: " + this.regionalCode +  ":" + this.letters + " " + this.digits;
    }
}