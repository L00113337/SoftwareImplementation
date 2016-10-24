package ie.lyit.bank;

/**
 * Created by stanley on 10/15/16.
 */
public class Address {
    private String Street;
    private String Area;
    private String Town;
    private String State;
    private String Country;

    public Address(String street, String area, String town, String state, String country) {
        this.Street = street;
        this.Area = area;
        this.Town = town;
        this.State = state;
        this.Country = country;
    }

    public void setAdress(String street, String area, String town, String state, String country) {
        this.Street = street;
        this.Area = area;
        this.Town = town;
        this.State = state;
        this.Country = country;
    }

    public String getAddress() {
        if (this.Street == null) {
            return  this.Area + "\n" + this.Town + "\n" + this.State + "\n" + this.Country;
        }
        return  this.Street + "\n" + this.Area + "\n" + this.Town + "\n" + this.State + "\n" + this.Country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (Street != null ? !Street.equals(address.Street) : address.Street != null) return false;
        if (Area != null ? !Area.equals(address.Area) : address.Area != null) return false;
        if (Town != null ? !Town.equals(address.Town) : address.Town != null) return false;
        if (State != null ? !State.equals(address.State) : address.State != null) return false;
        return Country != null ? Country.equals(address.Country) : address.Country == null;
    }

    @Override
    public String toString() {
        if (this.Street == null) {
            return  this.Area + "\n" + this.Town + "\n" + this.State + "\n" + this.Country;
        }
        return  this.Street + "\n" + this.Area + "\n" + this.Town + "\n" + this.State + "\n" + this.Country;
    }
}

