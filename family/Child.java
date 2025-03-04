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