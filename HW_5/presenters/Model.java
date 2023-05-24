package HW.HW_5.presenters;

import java.util.Collection;
import java.util.Date;

import HW.HW_5.models.Table;

public interface Model {
    
    /**
     * Получение всех столиков
     * @return столики
     */
    Collection<Table> loadTables();
    
    /**
     * Бронирование столиков
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);
    
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
