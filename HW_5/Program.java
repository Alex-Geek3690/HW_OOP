package HW.HW_5;

import java.util.Date;

import HW.HW_5.models.TableModel;
import HW.HW_5.presenters.BookingPresenter;
import HW.HW_5.views.BookingView;

public class Program{

public static void main(String[] args) {
    
    TableModel tableModel = new TableModel();
    BookingView bookingView = new BookingView();
    BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
    bookingPresenter.loadTables();
    bookingPresenter.updateView();

    bookingView.reservationTable(new Date(), 2, "Станислав");
    bookingView.changeReservationTable(1001, new Date(), 1, "Станислав");
}
}