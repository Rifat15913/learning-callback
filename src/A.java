public class A implements One {
    void execute() {
        B objectB = new B();
        objectB.setOne(this);
        objectB.execute();
    }

    @Override
    public void ok() {
        System.out.println("ok() is called");
    }
}
