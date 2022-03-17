package patterns.solid.dependencyinversion.violate;

import patterns.solid.dependencyinversion.Person;
import patterns.solid.dependencyinversion.Relationship;
import patterns.solid.dependencyinversion.Triplet;

import java.util.ArrayList;
import java.util.List;

//low-level
public class Relationships {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }
}
