namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
    /// </summary>
    /// <value>Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.</value>
    public enum BidFloorObjectiveType
    {
        
        /// <summary>
        /// Enum AWARENESSEnum for AWARENESS
        /// </summary>
        AWARENESSEnum = 1,
        
        /// <summary>
        /// Enum CONSIDERATIONEnum for CONSIDERATION
        /// </summary>
        CONSIDERATIONEnum = 2,
        
        /// <summary>
        /// Enum WEBCONVERSIONEnum for WEB_CONVERSION
        /// </summary>
        WEBCONVERSIONEnum = 3,
        
        /// <summary>
        /// Enum CATALOGSALESEnum for CATALOG_SALES
        /// </summary>
        CATALOGSALESEnum = 4,
        
        /// <summary>
        /// Enum VIDEOCOMPLETIONEnum for VIDEO_COMPLETION
        /// </summary>
        VIDEOCOMPLETIONEnum = 5,
        
        /// <summary>
        /// Enum SALESEnum for SALES
        /// </summary>
        SALESEnum = 6
    }
