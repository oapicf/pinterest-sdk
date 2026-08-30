namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Board 
{
    public DateTime BoardPinsModifiedAt { get; set; }
    public int CollaboratorCount { get; set; }
    public DateTime CreatedAt { get; set; }
    public string Description { get; set; }
    public int FollowerCount { get; set; }
    public string Id { get; set; }
    public bool IsAdsOnly { get; set; } = false;
    public BoardMedia Media { get; set; }
    public string Name { get; set; }
    public BoardOwner Owner { get; set; }
    public int PinCount { get; set; }
    
    public BoardPrivacy Privacy { get; set; }
}


