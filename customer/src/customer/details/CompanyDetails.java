package customer.details;

public class CompanyDetails
{

    String companyName;
    String companyAddress;
    String companyPhone;
    String companyEmail;
    String companyWebsite;

    public String getCompanyName()
    {
        return companyName;
    }

    public String getCompanyAddress()
    {
        return companyAddress;
    }

    public String getCompanyPhone()
    {
        return companyPhone;
    }

    public String getCompanyEmail()
    {
        return companyEmail;
    }

    public String getCompanyWebsite()
    {
        return companyWebsite;
    }

    public CompanyDetails setCompanyName(String companyName)
    {
        this.companyName = companyName;
        return this;
    }

    public CompanyDetails setCompanyAddress(String companyAddress)
    {
        this.companyAddress = companyAddress;
        return this;
    }

    public CompanyDetails setCompanyPhone(String companyPhone)
    {
        this.companyPhone = companyPhone;
        return this;
    }

    public CompanyDetails setCompanyEmail(String companyEmail)
    {
        this.companyEmail = companyEmail;
        return this;
    }

    public CompanyDetails setCompanyWebsite(String companyWebsite)
    {
        this.companyWebsite = companyWebsite;
        return this;
    }
}
