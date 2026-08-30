namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class AdAccountCreate 
{
    
    public Country Country { get; set; }
    
    public Currency Currency { get; set; }
    public string Name { get; set; }
    public string OwnerUserId { get; set; }
    public string VarTimeZone { get; set; }
}


