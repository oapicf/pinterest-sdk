namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.
    /// </summary>
    /// <value>Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.</value>
    public enum CampaignObjectiveType
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
        /// Enum VIDEOVIEWEnum for VIDEO_VIEW
        /// </summary>
        VIDEOVIEWEnum = 3,
        
        /// <summary>
        /// Enum WEBCONVERSIONEnum for WEB_CONVERSION
        /// </summary>
        WEBCONVERSIONEnum = 4,
        
        /// <summary>
        /// Enum CATALOGSALESEnum for CATALOG_SALES
        /// </summary>
        CATALOGSALESEnum = 5,
        
        /// <summary>
        /// Enum WEBSESSIONSEnum for WEB_SESSIONS
        /// </summary>
        WEBSESSIONSEnum = 6,
        
        /// <summary>
        /// Enum VIDEOCOMPLETIONEnum for VIDEO_COMPLETION
        /// </summary>
        VIDEOCOMPLETIONEnum = 7,
        
        /// <summary>
        /// Enum APPINSTALLEnum for APP_INSTALL
        /// </summary>
        APPINSTALLEnum = 8,
        
        /// <summary>
        /// Enum SALESEnum for SALES
        /// </summary>
        SALESEnum = 9,
        
        /// <summary>
        /// Enum LEADSEnum for LEADS
        /// </summary>
        LEADSEnum = 10,
        
        /// <summary>
        /// Enum CTVCONSIDERATIONEnum for CTV_CONSIDERATION
        /// </summary>
        CTVCONSIDERATIONEnum = 11
    }
