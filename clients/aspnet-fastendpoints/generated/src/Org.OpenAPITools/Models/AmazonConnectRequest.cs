namespace Org.OpenAPITools.Models;


/// <summary>
/// Request containing OTP and Amazon storefront info called by Amazon
/// </summary>
public class AmazonConnectRequest 
{
    public string AmazonStorefrontId { get; set; }
    public string AmazonStorefrontName { get; set; }
    public string AmazonStorefrontUrl { get; set; }
    public string AmazonUserId { get; set; }
    public bool IsAmazonAccountLinked { get; set; }
    public string OneTimePasscode { get; set; }
    public string PinterestUserId { get; set; }
}


