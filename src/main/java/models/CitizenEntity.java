package models;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "citizen", schema = "public", catalog = "protection")
@XmlRootElement
public class CitizenEntity {
    private int id;
    private String name;
    private String firstname;
    private Integer cin;
    private String location;
    private Integer phonenum;
    private String email;
    private Integer phonenum2;
    private Integer numberfamilly;
    private Integer neighborNumphone;
    private Integer numsocialsecurity;
    private Integer locationsize;
    private Integer nearstHydrant;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 50)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "cin", nullable = true)
    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 100)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "phonenum", nullable = true)
    public Integer getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Integer phonenum) {
        this.phonenum = phonenum;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 80)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phonenum2", nullable = true)
    public Integer getPhonenum2() {
        return phonenum2;
    }

    public void setPhonenum2(Integer phonenum2) {
        this.phonenum2 = phonenum2;
    }

    @Basic
    @Column(name = "numberfamilly", nullable = true)
    public Integer getNumberfamilly() {
        return numberfamilly;
    }

    public void setNumberfamilly(Integer numberfamilly) {
        this.numberfamilly = numberfamilly;
    }

    @Basic
    @Column(name = "neighbor_numphone", nullable = true)
    public Integer getNeighborNumphone() {
        return neighborNumphone;
    }

    public void setNeighborNumphone(Integer neighborNumphone) {
        this.neighborNumphone = neighborNumphone;
    }

    @Basic
    @Column(name = "numsocialsecurity", nullable = true)
    public Integer getNumsocialsecurity() {
        return numsocialsecurity;
    }

    public void setNumsocialsecurity(Integer numsocialsecurity) {
        this.numsocialsecurity = numsocialsecurity;
    }

    @Basic
    @Column(name = "locationsize", nullable = true)
    public Integer getLocationsize() {
        return locationsize;
    }

    public void setLocationsize(Integer locationsize) {
        this.locationsize = locationsize;
    }

    @Basic
    @Column(name = "nearst_hydrant", nullable = true)
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
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (cin != null ? !cin.equals(that.cin) : that.cin != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (phonenum != null ? !phonenum.equals(that.phonenum) : that.phonenum != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phonenum2 != null ? !phonenum2.equals(that.phonenum2) : that.phonenum2 != null) return false;
        if (numberfamilly != null ? !numberfamilly.equals(that.numberfamilly) : that.numberfamilly != null)
            return false;
        if (neighborNumphone != null ? !neighborNumphone.equals(that.neighborNumphone) : that.neighborNumphone != null)
            return false;
        if (numsocialsecurity != null ? !numsocialsecurity.equals(that.numsocialsecurity) : that.numsocialsecurity != null)
            return false;
        if (locationsize != null ? !locationsize.equals(that.locationsize) : that.locationsize != null) return false;
        if (nearstHydrant != null ? !nearstHydrant.equals(that.nearstHydrant) : that.nearstHydrant != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (cin != null ? cin.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (phonenum != null ? phonenum.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phonenum2 != null ? phonenum2.hashCode() : 0);
        result = 31 * result + (numberfamilly != null ? numberfamilly.hashCode() : 0);
        result = 31 * result + (neighborNumphone != null ? neighborNumphone.hashCode() : 0);
        result = 31 * result + (numsocialsecurity != null ? numsocialsecurity.hashCode() : 0);
        result = 31 * result + (locationsize != null ? locationsize.hashCode() : 0);
        result = 31 * result + (nearstHydrant != null ? nearstHydrant.hashCode() : 0);
        return result;
    }
}
