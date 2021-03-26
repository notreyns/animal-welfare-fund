package attempt.charity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String donorCountry;

    public Users() {}

    public Users(Integer id, String name, String donorCountry) {
        this.id = id;
        this.name = name;
        this.donorCountry = donorCountry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDonorCountry() {
        return donorCountry;
    }

    public void setDonorCountry(String donorCountry) {
        this.donorCountry = donorCountry;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + donorCountry.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (((Users) obj).getName().equals(name))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return name + ":" + donorCountry;
    }
}