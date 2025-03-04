package family;

public class Parent {

    public String name = "The Penguin Family";
    private String secret = "Parents don't want to let go of children";
    protected String familySecret = "We love Cats!";

    public void whatParentCanSay() {
        System.out.println("What Parent Knows");
        System.out.println("Family Name: " + this.name);
        System.out.println("Parent's Secret: " + this.secret);
        System.out.println("Family Secret: " + this.familySecret);
    }
}



package family;

public class Child extends Parent {

    public void whatChildCanSay() {

        System.out.println("What Child Knows");
        System.out.println("Family Name: " + this.name);
        
        // Child cannot access private variables from Parent
        //System.out.println(this.secret);

        // Child can access protected variable from Parent since Child inherits Parent
        System.out.println("Family Secret: " + this.familySecret);
    }
}

import family.Child;
import family.Parent;

class Stranger {

    void whatStrangerCanSay() {

        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("Details Stranger can obtain without asking (direct access) from parent");
        System.out.println("Family Name: " + parent.name);

        // Stranger cannot obtain secret since it's private
        //System.out.println(parent.secret);

        // Stranger cannot obtain familySecret since it's protected
        //System.out.println(parent.familySecret);

        System.out.println("\nDetails Stranger can obtain without asking (direct access) from child");
        System.out.println("Family Name: " + child.name);

        // Stranger cannot obtain secret since it's private
        //System.out.println(child.secret);

        // Stranger cannot obtain familySecret since it's private
        //System.out.println(child.familySecret);
    }
}

public class Ques4 {

    public static void main(String args[]) {
        
        System.out.println();
        Stranger stranger = new Stranger();
        stranger.whatStrangerCanSay();

        System.out.println();
        Child child = new Child();
        child.whatChildCanSay();

        System.out.println();
        Parent parent = new Parent();
        parent.whatParentCanSay();
    }
     
}