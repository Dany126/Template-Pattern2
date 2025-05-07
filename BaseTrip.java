public abstract class BaseTrip {

    public void takeTrip() {
        this.boardBus();
        this.arriveAtZoo();
        this.haveLunch();
        this.leaveZoo();
        System.out.println("=============");
    }

    public void boardBus() {
        System.out.println(" we are boarding the bus");
    }

    public void arriveAtZoo() {
        System.out.println(" we arrived at the zoo");
    }

    public abstract void haveLunch();

    public void leaveZoo() {
        System.out.println(" we left the zoo");
    }
}
