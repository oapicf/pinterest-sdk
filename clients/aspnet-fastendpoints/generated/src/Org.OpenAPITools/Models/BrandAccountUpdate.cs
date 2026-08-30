namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create or update operation model.
/// </summary>
public class BrandAccountUpdate 
{
    public string About { get; set; }
    
    public Country Country { get; set; }
    public string Name { get; set; }
    public BrandAccountProfileImageUpdate ProfileImage { get; set; }
    public string Username { get; set; }
    public string Website { get; set; }
}


