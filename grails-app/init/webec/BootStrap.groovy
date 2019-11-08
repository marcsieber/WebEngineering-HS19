package webec

import grails.util.Environment
import org.codehaus.groovy.runtime.DateGroovyMethods

class BootStrap {

    def init = { servletContext ->

        if(Environment.current != Environment.DEVELOPMENT) { // guard clause
            return ;
        }

        Person marc = new Person(firstName: "Marc", lastName: "Sieber").save(failOnError: true);
        Person hugo = new Person(firstName: "Hugo", lastName: "Habich").save(failOnError: true);

        Room upstairs = new Room (name:  "1.313", capacity: 60).save(failOnError: true);
        Room downstairs = new Room (name: "5.2b16", capacity: 6).save(failOnError: true);


        use(DateGroovyMethods) {
            Date today = new Date().clearTime();

            for (int i=0; i<100; i++) {
                new Booking(booker: marc, room: upstairs, day: today + i, slot: Booking.AM).save(failOnError:true)
            }

            new Booking(booker: hugo, room: downstairs, day: today, slot: Booking.AM).save(failOnError:true)

        }

    }
    def destroy = {
    }
}
