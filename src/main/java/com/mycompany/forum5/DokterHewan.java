public class DokterHewan {
  private String nama;
  private String spesialis

  public DokterHewan(String nama, String spesialis) {
    this.nama = nama;
    this.spesialis = spesialis;
  }

  public String getNama() {
    return this.nama;
  }
  public String getSpesialis() {
    return this.spesialis;
  }

  public void periksaHewan(Hewan hewan) {
    System.out.println("Dokter ini " + nama + " memeriksa hewan " + hewan.nama);
  }
}
