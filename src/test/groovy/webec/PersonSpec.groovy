package webec

class PersonSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test construction"() {

        given:
            Person marc = new Person(firstName: "Marc", lastName: "Sieber");
        expect: "one can access the params"
            marc.firstName == "Marc"
            marc.lastName == "Sieber"

    }
}
