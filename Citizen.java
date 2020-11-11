package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.ExProblem_2;
public class Citizen implements Person, Identifiable, Birthable {

    // I.napravihme Citizen-a da implementira Person => da ima 1) Ime i 2) Godini
    // II. napravihme Citizen-a da implementira Identifiable => da ima 1) SSN/EGN
    // III. napravihme Citizen-a da implementira Birthable => da ima 1) data na rajdane
    // IV. vsichkite ni metodi sa @ OVERRIGHT - zashtoto gi dyrpame ot interface-ovete! No gi dopiswame kakto da RETURN-at;
    // V. trqbwa da izredim property-tata na klasa Citizen(koito sa property-ta i na metoite);
    // VI. trqbva ni i CONSTRUCTOR vse pak


    // Prosto otdelqme metodite v otdelen class - narechen interface i im pishem signaturata - bez da pishem tqhnata implementaciq
    //


    private String name;
    private int age;
    private String id;
    private String birthDate;


    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
