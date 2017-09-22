package iwvg.swc.joaquin.clases;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;
    
    public static final String EMPTY_COLLECTION = "Empty collection";

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    
    public double multiplicacion(){
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        double result = 1;
        for (double item : this.collection) {
                result = result * item;
            
        }
        return result;
        
    }

}
