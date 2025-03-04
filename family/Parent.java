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