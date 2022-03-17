package patterns.solid.dependencyinversion.apply;

import patterns.solid.dependencyinversion.Person;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
