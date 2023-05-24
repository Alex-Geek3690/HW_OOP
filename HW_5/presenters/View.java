package HW.HW_5.presenters;

import java.util.Collection;

import HW.HW_5.models.Table;

public interface View {

    /**
     * Отобразить список всех столиков
     * @param tables список столиков
     */
   public void showTables(Collection<Table> tables);

   void showReservationStatus(int reservationNo);

   /**
    * Установить наблюдателя
    * @param observer наблюдатель(презентер)
    */
   void setObserver(ViewObserver observer);
}
