package customer;

import customer.details.CompanyDetails;
import customer.details.PersonalDetails;

public abstract class Person implements IPerson
{

    protected PersonalDetails personalDetails;
    protected CompanyDetails companyDetails;

    @Override
    public PersonalDetails getPersonalDetails()
    {
        return personalDetails;
    }

    @Override
    public CompanyDetails getCompanyDetails()
    {
        return companyDetails;
    }
}
