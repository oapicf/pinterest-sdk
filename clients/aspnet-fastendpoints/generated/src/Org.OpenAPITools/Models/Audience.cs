namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Audience 
{
    public string AdAccountId { get; set; }
    
    public PinnerListType AudienceType { get; set; }
    public string CreatedByCompanyName { get; set; }
    public int CreatedTimestamp { get; set; }
    public string Description { get; set; }
    public string Id { get; set; }
    public bool IsNca { get; set; }
    public string Name { get; set; }
    public AudienceRule Rule { get; set; }
    public int Size { get; set; }
    
    public AudienceStatus Status { get; set; }
    public string Type { get; set; }
    public int UpdatedTimestamp { get; set; }
}


