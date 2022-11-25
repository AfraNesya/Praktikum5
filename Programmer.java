public class Programmer extends Pegawai{
    private double bonus;

    public Programmer(String name, double gajipokok) {
        super(name, gajipokok);
        this.bonus = 1000000;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tambah Bonus \t : "+ this.bonus);
        System.out.println("Total Gaji");
        System.out.println(+getGajipokok()+getBonus());
    }
}