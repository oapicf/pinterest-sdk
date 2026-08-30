namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
    /// </summary>
    /// <value>Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.</value>
    public enum ObjectiveType
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
        SALESEnum = 6,
        
        /// <summary>
        /// Enum APPINSTALLEnum for APP_INSTALL
        /// </summary>
        APPINSTALLEnum = 7,
        
        /// <summary>
        /// Enum CTVCONSIDERATIONEnum for CTV_CONSIDERATION
        /// </summary>
        CTVCONSIDERATIONEnum = 8
    }
