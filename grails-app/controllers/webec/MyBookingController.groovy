package webec

class BookingController {

    def probiere() {

         // find the last namees

        // Here is a cup of care, ohhh look, it is empty :(
        def booker = Person.findByLastName("Sieber")
        def result = Booking.findAllByBooker(booker)*.room
        respond result
    }

    static scaffold = Booking;
}
