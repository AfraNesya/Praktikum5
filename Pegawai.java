public class Pegawai {
    private String name;
    private double gajipokok;
    // overload Constructor
    public Pegawai (String name, double gajipokok){
        this.name = name;
        this.gajipokok = gajipokok;
    }


    public String getName() {
        return name;
    }

    public double getGajipokok() {
        return gajipokok;
    }


    // Overriding
    public void display (){
        System.out.println("\nNama \t\t\t : " +getName());
        System.out.println("Gaji Pokok \t\t : " +getGajipokok());
    }
}