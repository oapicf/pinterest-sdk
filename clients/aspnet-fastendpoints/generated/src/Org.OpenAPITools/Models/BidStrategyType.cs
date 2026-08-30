namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
    /// </summary>
    /// <value>Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".</value>
    public enum BidStrategyType
    {
        
        /// <summary>
        /// Enum AUTOMATICBIDEnum for AUTOMATIC_BID
        /// </summary>
        AUTOMATICBIDEnum = 1,
        
        /// <summary>
        /// Enum MAXBIDEnum for MAX_BID
        /// </summary>
        MAXBIDEnum = 2,
        
        /// <summary>
        /// Enum TARGETAVGEnum for TARGET_AVG
        /// </summary>
        TARGETAVGEnum = 3
    }
