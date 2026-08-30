namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdsCreditDiscountsResponse 
{
    public bool Active { get; set; }
    public string AdvertiserId { get; set; }
    public string DiscountCurrency { get; set; }
    public decimal DiscountInMicroCurrency { get; set; }
    
    public AdsCreditDiscountType? DiscountType { get; set; }
    public decimal RemainingDiscountInMicroCurrency { get; set; }
    public string Title { get; set; }
}


