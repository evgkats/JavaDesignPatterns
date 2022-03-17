package patterns.solid.dependencyinversion.apply;

import patterns.solid.dependencyinversion.Person;

import java.util.List;

public class Research {
    public Research(RelationshipBrowser relationshipBrowser) {
        List<Person> children = relationshipBrowser.findAllChildrenOf("John");
        children.forEach(c -> System.out.println("John has a child called: " + c.name));
    }
}
