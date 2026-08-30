namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create or update operation model.
/// </summary>
public class AdAccountsAudienceUpdate 
{
    public string AdAccountId { get; set; }
    
    public AudienceType AudienceType { get; set; }
    public string Description { get; set; }
    public string Name { get; set; }
    
    public AudienceUpdateOperationType OperationType { get; set; }
    public AdAccountsAudienceRule Rule { get; set; }
}


