namespace Org.OpenAPITools.Models;


/// <summary>
/// Asset ID with permission levels.
/// </summary>
public class AssetIdWithPermissions 
{
    public string Id { get; set; }
    public List<string> Permissions { get; set; }
}


