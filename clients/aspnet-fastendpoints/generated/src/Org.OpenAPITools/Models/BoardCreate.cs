namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class BoardCreate 
{
    public string Description { get; set; }
    public bool IsAdsOnly { get; set; } = false;
    public string Name { get; set; }
    
    public BoardPrivacy Privacy { get; set; }
}


