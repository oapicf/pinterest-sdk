namespace Org.OpenAPITools.Models;


/// <summary>
/// Created/updated resource on success or error details on failure
/// </summary>
public class CampaignAdPreviewCreate200ResponseInnerData 
{
    public string AdAccountId { get; set; }
    public string AdGroupId { get; set; }
    public int ClientId { get; set; }
    public int ExpiresAt { get; set; }
    public bool IsActive { get; set; }
    public int PinId { get; set; }
    public int PinPromotionId { get; set; }
    public int PromotedProductGroupId { get; set; }
    public string Url { get; set; }
    public int UserId { get; set; }
    public string Uuid { get; set; }
    public PinterestLibError Exceptions { get; set; }
}


