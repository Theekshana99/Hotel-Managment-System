package view.tm;

public class GuestTM {
    private String id;
    private String name;
    private String address;
    private String nic;
    private String gender;
    private String city;
    private String country;
    private String telephone;
    private String email;
    private String workPlace;
    private String checkInDate;
    private String checkOutDate;

    public GuestTM() {
    }

    public GuestTM(String id, String name, String address, String nic, String gender, String city, String country, String telephone, String email, String workPlace, String checkInDate, String checkOutDate) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setNic(nic);
        this.setGender(gender);
        this.setCity(city);
        this.setCountry(country);
        this.setTelephone(telephone);
        this.setEmail(email);
        this.setWorkPlace(workPlace);
        this.setCheckInDate(checkInDate);
        this.setCheckOutDate(checkOutDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}
