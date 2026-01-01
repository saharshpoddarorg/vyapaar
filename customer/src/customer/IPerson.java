package customer;


import customer.details.CompanyDetails;
import customer.details.PersonalDetails;

public interface IPerson
{

    PersonalDetails getPersonalDetails();

    CompanyDetails getCompanyDetails();
}
