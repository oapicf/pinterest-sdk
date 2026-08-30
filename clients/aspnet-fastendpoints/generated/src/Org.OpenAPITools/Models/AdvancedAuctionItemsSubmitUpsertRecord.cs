namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an item bid option upsert operation
/// </summary>
public class AdvancedAuctionItemsSubmitUpsertRecord 
{
    public AdvancedAuctionBidOptions BidOptions { get; set; }
    
    public Country Country { get; set; }
    public List<AdvancedAuctionOperationError> Errors { get; set; }
    public string ItemId { get; set; }
    
    public Language Language { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum UPSERTEnum for UPSERT
        /// </summary>
        UPSERTEnum = 1
    }

    public OperationEnum Operation { get; set; }
    public List<UpdateMaskBidOptionField> UpdateMask { get; set; }
}


