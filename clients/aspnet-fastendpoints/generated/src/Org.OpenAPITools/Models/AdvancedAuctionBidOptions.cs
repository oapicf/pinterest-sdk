namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
/// </summary>
public class AdvancedAuctionBidOptions 
{
    public AppTypeMultipliers AppTypeMultipliers { get; set; }
    public long BidInMicroCurrency { get; set; }
    public PlacementMultipliers PlacementMultipliers { get; set; }
}


