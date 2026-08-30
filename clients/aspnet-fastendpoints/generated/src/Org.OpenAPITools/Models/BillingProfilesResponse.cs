namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BillingProfilesResponse 
{
    public string AdvertiserId { get; set; }
    
    public BillingType BillingType { get; set; }
    
    public BillingProfileCardType CardType { get; set; }
    public string Id { get; set; }
    
    public BillingProfilePaymentMethodBrand PaymentMethodBrand { get; set; }
    
    public BillingProfileStatus Status { get; set; }
}


