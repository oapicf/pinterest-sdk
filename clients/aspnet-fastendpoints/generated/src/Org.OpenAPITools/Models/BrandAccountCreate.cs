namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class BrandAccountCreate 
{
    public string About { get; set; }
    
    public Country Country { get; set; }
    public string Name { get; set; }
    public BrandAccountProfileImage ProfileImage { get; set; }
    public string Username { get; set; }
    public string Website { get; set; }
}


