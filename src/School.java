import java.util.ArrayList;

public class School {
    private ArrayList<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void printMembers() {
        for (Person member : members) {
            System.out.println(member.toString());
        }
    }
}