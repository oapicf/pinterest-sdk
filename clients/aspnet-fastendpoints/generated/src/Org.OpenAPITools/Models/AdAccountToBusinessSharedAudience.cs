namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdAccountToBusinessSharedAudience 
{
    public string AudienceId { get; set; }
    public List<Role> Permissions { get; set; }
    public List<string> RecipientBusinessIds { get; set; }
}


