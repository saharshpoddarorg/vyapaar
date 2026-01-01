package customer;

import customer.details.PersonalDetails;

public class Payer extends Person
{

    public Payer(String name, String phone)
    {
        personalDetails =
                new PersonalDetails()
                        .setName(name)
                        .setPhone(phone);
    }
}
