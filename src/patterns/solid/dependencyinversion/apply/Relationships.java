package patterns.solid.dependencyinversion.apply;

import patterns.solid.dependencyinversion.Person;
import patterns.solid.dependencyinversion.Relationship;
import patterns.solid.dependencyinversion.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream()
                .filter(x -> x.getFirst().name.equals(name) && x.getSecond() == Relationship.PARENT)
                .map(Triplet::getThird)
                .collect(Collectors.toList());
    }
}
