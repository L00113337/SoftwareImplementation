package ie.lyit.bank;

/**
 * Created by stanley on 10/15/16.
 */
public class Name  {
    protected String title, firstname, surname;
    public Name() {
        title = "";
        firstname = "";
        surname = "";
    }
    public Name (String t, String fn, String s) {
        title = t;
        firstname = fn;
        surname = s;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isFemale() {
        if (title.equals("Miss") ||  title.equals("Ms") || title.equals("Mrs")) return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name = (Name) o;

        if (title != null ? !title.equals(name.title) : name.title != null) return false;
        if (firstname != null ? !firstname.equals(name.firstname) : name.firstname != null) return false;
        return surname != null ? surname.equals(name.surname) : name.surname == null;

    }
    @Override
    public String toString() {
        return  title + " " +  firstname + " " + surname;
    }
}

