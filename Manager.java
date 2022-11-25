public class Manager extends Pegawai{
    private double tunjangan;

    public Manager (String name, double gajipokok) {
        super(name, gajipokok);
        this.tunjangan = 2000000;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tambah tunjangan : " + this.tunjangan);
        System.out.println("Total Gaji");
        System.out.println(+getGajipokok()+getTunjangan());
    }
}