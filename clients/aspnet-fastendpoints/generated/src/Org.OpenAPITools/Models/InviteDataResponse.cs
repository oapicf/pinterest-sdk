namespace Org.OpenAPITools.Models;


/// <summary>
/// Metadata for the invite/request.
/// </summary>
public class InviteDataResponse 
{
    public int InviteExpiration { get; set; }
    public string InviteStatus { get; set; }
    public string InviteType { get; set; }
    public int LastUpdatedTime { get; set; }
    public int SentAt { get; set; }
}


