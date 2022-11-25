public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("ANTON", 3500000);
        Pegawai manager1 = new Manager("BELA", 6000000);
        Pegawai programmer = new Programmer("REIHAN", 4500000);
        pegawai1.display();
        manager1.display();
        programmer.display();
    }
}