package webec

import org.codehaus.groovy.runtime.DateGroovyMethods

class BootStrap {

    def init = { servletContext ->

        Person marc = new Person(firstName: "Marc", lastName: "Sieber").save(failOnError: true);
        Person hugo = new Person(firstName: "Hugo", lastName: "Habich").save(failOnError: true);

        Room upstairs = new Room (name:  "1.313", capacity: 60).save(failOnError: true);
        Room downstairs = new Room (name: "5.2b16", capacity: 6).save(failOnError: true);


        Date today = new Date();
        for (int i = 0; i < 100; i ++) {
            new Booking(booker: marc, room: upstairs, day: today, slot: Booking.AM).save( failOnError: true);

        }
    }
    def destroy = {
    }
}
