namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdAccountsAudience 
{
    public string AdAccountId { get; set; }
    
    public AudienceType AudienceType { get; set; }
    public string CreatedByCompanyName { get; set; }
    public int CreatedTimestamp { get; set; }
    public string Description { get; set; }
    public string Id { get; set; }
    public bool IsNca { get; set; }
    public string Name { get; set; }
    public AdAccountsAudienceRule Rule { get; set; }
    public int Size { get; set; }
    
    public AudienceStatus Status { get; set; }
    public string Type { get; set; }
    public int UpdatedTimestamp { get; set; }
}


