package models;

import javax.persistence.*;

@Entity
@Table(name = "citizen", schema = "public", catalog = "protection")
public class CitizenEntity {
    private int id;
    private String lastname;
    private String firstname;
    private String cin;
    private String phonenumber;
    private String email;
    private String phonenumber2;
    private String familyNumber;
    private String neighborPhone;
    private double localizationH;
    private double localizationV;
    private String numsocialsecurity;
    private Integer nearstHydrant;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "cin")
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Basic
    @Column(name = "phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phonenumber2")
    public String getPhonenumber2() {
        return phonenumber2;
    }

    public void setPhonenumber2(String phonenumber2) {
        this.phonenumber2 = phonenumber2;
    }

    @Basic
    @Column(name = "family_number")
    public String getFamilyNumber() {
        return familyNumber;
    }

    public void setFamilyNumber(String familyNumber) {
        this.familyNumber = familyNumber;
    }

    @Basic
    @Column(name = "neighbor_phone")
    public String getNeighborPhone() {
        return neighborPhone;
    }

    public void setNeighborPhone(String neighborPhone) {
        this.neighborPhone = neighborPhone;
    }

    @Basic
    @Column(name = "localization_h")
    public double getLocalizationH() {
        return localizationH;
    }

    public void setLocalizationH(double localizationH) {
        this.localizationH = localizationH;
    }

    @Basic
    @Column(name = "localization_v")
    public double getLocalizationV() {
        return localizationV;
    }

    public void setLocalizationV(double localizationV) {
        this.localizationV = localizationV;
    }

    @Basic
    @Column(name = "numsocialsecurity")
    public String getNumsocialsecurity() {
        return numsocialsecurity;
    }

    public void setNumsocialsecurity(String numsocialsecurity) {
        this.numsocialsecurity = numsocialsecurity;
    }

    @Basic
    @Column(name = "nearst_hydrant")
    public Integer getNearstHydrant() {
        return nearstHydrant;
    }

    public void setNearstHydrant(Integer nearstHydrant) {
        this.nearstHydrant = nearstHydrant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CitizenEntity that = (CitizenEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.localizationH, localizationH) != 0) return false;
        if (Double.compare(that.localizationV, localizationV) != 0) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (cin != null ? !cin.equals(that.cin) : that.cin != null) return false;
        if (phonenumber != null ? !phonenumber.equals(that.phonenumber) : that.phonenumber != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phonenumber2 != null ? !phonenumber2.equals(that.phonenumber2) : that.phonenumber2 != null) return false;
        if (familyNumber != null ? !familyNumber.equals(that.familyNumber) : that.familyNumber != null) return false;
        if (neighborPhone != null ? !neighborPhone.equals(that.neighborPhone) : that.neighborPhone != null)
            return false;
        if (numsocialsecurity != null ? !numsocialsecurity.equals(that.numsocialsecurity) : that.numsocialsecurity != null)
            return false;
        if (nearstHydrant != null ? !nearstHydrant.equals(that.nearstHydrant) : that.nearstHydrant != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (cin != null ? cin.hashCode() : 0);
        result = 31 * result + (phonenumber != null ? phonenumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phonenumber2 != null ? phonenumber2.hashCode() : 0);
        result = 31 * result + (familyNumber != null ? familyNumber.hashCode() : 0);
        result = 31 * result + (neighborPhone != null ? neighborPhone.hashCode() : 0);
        temp = Double.doubleToLongBits(localizationH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(localizationV);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (numsocialsecurity != null ? numsocialsecurity.hashCode() : 0);
        result = 31 * result + (nearstHydrant != null ? nearstHydrant.hashCode() : 0);
        return result;
    }
}
