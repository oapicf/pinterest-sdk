namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdAccount 
{
    
    public Country Country { get; set; }
    public int CreatedTime { get; set; }
    
    public Currency Currency { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    public AdAccountOwner Owner { get; set; }
    public List<BusinessAccessRole> Permissions { get; set; }
    public string VarTimeZone { get; set; }
    public int UpdatedTime { get; set; }
}


