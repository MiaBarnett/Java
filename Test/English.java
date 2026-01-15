public abstract class English implements SysLang {
    public boolean equals(Object comparator) {

    }
    public void greeting() {
        System.out.println("Hello!");
    }
    public void greeting(String msg) {
        System.out.println(msg);
    }
    public void salutations() {
        System.out.println("Hello!");
    }
    public void salutations(String msg) {
        System.out.println(msg);
    }
    public String getDialectTitle() {
        return switch (this.getClass()) {
            case Cockney.class -> "Cockney.";
            case Bostoner -> "Bostoner.";
            default -> "Not a dialect of English.";
        };
    }
    public abstract boolean checkAlNum(String tocheck);
}