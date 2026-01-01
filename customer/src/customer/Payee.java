package customer;

import customer.details.PersonalDetails;

public class Payee extends Person
{

    public Payee(String name, String phone)
    {
        personalDetails =
                new PersonalDetails()
                        .setName(name)
                        .setPhone(phone);
    }
}
