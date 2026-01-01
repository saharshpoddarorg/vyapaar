package customer.details;

public class PersonalDetails
{

    String name;
    String address;
    String email;
    String phone;

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }

    public PersonalDetails setName(String name)
    {
        this.name = name;
        return this;
    }

    public PersonalDetails setAddress(String address)
    {
        this.address = address;
        return this;
    }

    public PersonalDetails setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public PersonalDetails setPhone(String phone)
    {
        this.phone = phone;
        return this;
    }
}
