namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class AdAccountsAudienceCreate 
{
    public string AdAccountId { get; set; }
    
    public AudienceType AudienceType { get; set; }
    public string Description { get; set; }
    public string Name { get; set; }
    public AdAccountsAudienceRule Rule { get; set; }
}


