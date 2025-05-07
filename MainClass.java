public class MainClass {

    private static void demoOne() {
        BaseTrip t = new RegularTrip();
        t.takeTrip();

        t = new SilverTrip();
        t.takeTrip();

        t = new GoldTrip();
        t.takeTrip();
    }

    private static void demoTwo() {
        DataMiner d = new DocDataMiner();
        d.mine("D:/template.docs");

        d = new PdfDataMiner();
        d.mine("D:/template.pdf");
    }

    public static void main(String[] args) {
        demoOne();
        // demoTwo();
    }

}
