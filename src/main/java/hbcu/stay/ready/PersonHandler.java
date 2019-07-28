package hbcu.stay.ready;


public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            // begin loop

            Person currentPerson = personArray[counter];
            String personStr = currentPerson.toString();
            result += personStr;// append `stringRepresentation` to `result` variable

            counter++;

        }// end loop
            return result;
    }



    public String forLoop() {
        String result = "";
        int i = 0;// identify initial value
        boolean terminalCondition = i < personArray.length;// identify terminal condition
        // identify increment, "i++"

        for(i = 0;i < personArray.length;i++)// use the above clauses to declare for-loop signature
        {// begin loop
            Person currentPerson = personArray[i];// use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation; // append `stringRepresentation` to `result` variable
        }// end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type - Person
        // identify array's variable-name -  person

        // use the above discoveries to declare for-each-loop signature
            for (Person person:personArray) {// begin loop
                String currentPerson = person.toString();// get `string Representation` of `currentPerson`
                result += currentPerson;// append `stringRepresentation` to `result` variable
            } // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
