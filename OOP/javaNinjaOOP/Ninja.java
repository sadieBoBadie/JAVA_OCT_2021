class Ninja {

    // Member variables -----------------
    private String name;
    private int health;

    // constructor ----------------------
    public Ninja() {
        this.setName("no name");
        this.setHealth(9001);
    }

    public Ninja(String name){
        this.name = name;
        this.health = 100;
    }

    // methods ---------------------------
    public void displayStats(){
        System.out.println("Name: " + this.getName());
        System.out.println("Health:" + this.getHealth());
    }

    public void eatStrawberry(){
        this.setHealth(10);
    }

    // --------------------------------------
    // GETTER & SETTERS
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}