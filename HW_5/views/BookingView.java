package HW.HW_5.views;

import java.util.Collection;
import java.util.Date;

import HW.HW_5.models.Table;
import HW.HW_5.presenters.View;
import HW.HW_5.presenters.ViewObserver;

public class BookingView implements View{
    
    private ViewObserver observer;
    
    /**
     * Отобразить список столиков
     * @param tables список столиков
     */
    public void showTables(Collection<Table> tables){
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    /**
     * @param observer наблюдатель(презентер)
     */
    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /**
     * Отобразить результат бронирования
     * @param reservationNo номер брони
     */
    @Override
    public void showReservationStatus(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер брони: #%d\n", reservationNo);
        }
        else {
            System.out.println("Ошибка бронирования столика.");
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования)
     * бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата броинрования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

}
