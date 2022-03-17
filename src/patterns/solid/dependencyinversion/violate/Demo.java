package patterns.solid.dependencyinversion.violate;

import patterns.solid.dependencyinversion.Person;

/*
    We are exposing an internal storage implementation of relations as a public getter for everyone to access
    Relationships is a low level module, because it is related to data storage (it doesn't have any business level logic)
    Its single responsibility is to allow us to manipulate the list
    Research is a high level module, because it allows us to perform operations on low level constructs
    This violates Dependency Inversion Principle, because a high level module(Research) has a constructor,
    which takes a low level module(Relationships) as a dependency.
 */
public class Demo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);
    }
}
