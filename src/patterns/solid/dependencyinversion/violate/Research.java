package patterns.solid.dependencyinversion.violate;

import patterns.solid.dependencyinversion.Person;
import patterns.solid.dependencyinversion.Relationship;
import patterns.solid.dependencyinversion.Triplet;

import java.util.List;


// high-level
public class Research {
    public Research(Relationships relationships) {
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getFirst().name.equals("John") && x.getSecond() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called: " + ch.getThird().name));
    }
}
