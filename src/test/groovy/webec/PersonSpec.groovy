package webec

class PersonSpec {

    void "test construction"() {

        given:
            Person marc = new Person(firstName: "Marc", lastName: "Sieber");
        expect: "one can access the params"
            marc.firstName == "Marc"
            marc.lastName == "Sieber"

    }
}
