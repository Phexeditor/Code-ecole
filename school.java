public class School{
    String name;
    String description;
    int people;
    String subject;
}

public School(String name, String description, int people, String subject){
    this.name = name;
    this.description = description;
    this.people = people;
    this.subject = subject;
}

public String toString(){
    return "This is the School " + name + "It have " + people + " and some the populare subjetc is " + subject;
}

public  String getdescription(){
    return description;
}