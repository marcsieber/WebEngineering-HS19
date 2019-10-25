package webec

import javafx.beans.binding.StringBinding


/** Should be domain class**/
class Person {

    String firstName;
    String lastName;

    static constraints = {

    }

    @Override
    String toString() {
        return firstName + " " + lastName;
    }
}
