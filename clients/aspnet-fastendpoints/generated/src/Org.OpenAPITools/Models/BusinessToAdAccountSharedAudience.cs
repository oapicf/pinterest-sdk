namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BusinessToAdAccountSharedAudience 
{
    public string AudienceId { get; set; }
    public List<Role> Permissions { get; set; }
    public List<string> RecipientAccountIds { get; set; }
}


