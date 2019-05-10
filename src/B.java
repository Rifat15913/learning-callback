class B {
    private One one;

    public One getOne() {
        return one;
    }

    void setOne(One one) {
        this.one = one;
    }

    void execute() {
        if (getOne() != null) {
            getOne().ok();
        }
    }
}
