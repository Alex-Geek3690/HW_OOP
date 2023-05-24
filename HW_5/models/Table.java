package HW.HW_5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter;

    private final Collection<Reservation> reservation = new ArrayList<>();

    private final int no;

    {
        no = ++counter; 
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservation() {
        return reservation;
    }

    @Override
    public String toString() {
        
        return String.format("Столик #%d", no);
    }
    

}
