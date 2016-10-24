package ie.lyit.bank;

/**
 * Created by stanley on 10/15/16.
 */
public class Account {

    protected Name name;
    protected Date dateOpened;
    protected Address address;
    protected Double balance;
    protected static int accNo = 1;
    protected int accNumber;

    public Account() {
        this.accNumber = accNo++;
    }

    public Account(Name name, Date dateOpened, Address address, Double balance) {
        this.name = name;
        this.dateOpened = dateOpened;
        this.address = address;
        this.balance = balance;
        this.accNumber = accNo++;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (accNumber != account.accNumber) return false;
        if (name != null ? !name.equals(account.name) : account.name != null) return false;
        if (dateOpened != null ? !dateOpened.equals(account.dateOpened) : account.dateOpened != null) return false;
        if (address != null ? !address.equals(account.address) : account.address != null) return false;
        return balance != null ? balance.equals(account.balance) : account.balance == null;

    }

    @Override
    public String toString() {
        return name + "\n" +
                address + "\n" +
                "dateOpened=" + dateOpened + "\n" +
                "balance=" + balance + "\n" +
                "accNumber=" + accNumber;
    }
}

