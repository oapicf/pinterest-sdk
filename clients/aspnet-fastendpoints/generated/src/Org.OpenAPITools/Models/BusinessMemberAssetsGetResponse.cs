namespace Org.OpenAPITools.Models;


/// <summary>
/// Paginated response for business member assets with total count metadata.
/// </summary>
public class BusinessMemberAssetsGetResponse 
{
    public string Bookmark { get; set; }
    public List<AssetIdPermissions> Items { get; set; }
    public int TotalDataCount { get; set; }
    public TotalCountByEntityStatus TotalDataCountByStatus { get; set; }
}


