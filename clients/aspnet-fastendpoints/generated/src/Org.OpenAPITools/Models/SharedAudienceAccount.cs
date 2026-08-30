namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SharedAudienceAccount 
{
    public string AccountId { get; set; }
    public string AccountName { get; set; }
    
    public AudienceAccountType AccountType { get; set; }
    public int SharedOnTimestamp { get; set; }
}


