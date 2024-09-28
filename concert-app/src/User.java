public class User {
    private String namaLengkap;
    private String phoneNumber;
    private String email;

   
    public User(String namaLengkap, String phoneNumber, String email) {
        this.namaLengkap = namaLengkap;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void registerUser() {
        
    }
}
