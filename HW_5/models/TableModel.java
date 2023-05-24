package HW.HW_5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


import HW.HW_5.presenters.Model;

public class TableModel implements Model {
    
    private Collection<Table> tables;

    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if(table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservation().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        // throw new RuntimeException("Некорректный номер столика");
    }

    /**
     * Поменять бронь столика 
     * @param oldReservation номер старого резерва (для снятия)
     * @param reservatioDate дата резерва столика
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){        
        
        for (Table table : tables) {
            for (Reservation reservation : table.getReservation()) {
                if (reservation.getId() != oldReservation) {
                    System.out.printf("Резерв #%d не cуществует.\n", oldReservation);
                    return -1;  
                }
                else{
                    table.getReservation().remove(reservation);
                    System.out.printf("Резерв #%d снят.\n", reservation.getId());
                    return reservationTable(reservationDate, tableNo, name); 
                }
            }
        }
        return tableNo;
    }
}
