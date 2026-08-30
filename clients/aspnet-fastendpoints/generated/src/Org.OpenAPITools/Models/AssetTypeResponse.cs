namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
    /// </summary>
    /// <value>Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.</value>
    public enum AssetTypeResponse
    {
        
        /// <summary>
        /// Enum ADACCOUNTEnum for AD_ACCOUNT
        /// </summary>
        ADACCOUNTEnum = 1,
        
        /// <summary>
        /// Enum MERCHANTEnum for MERCHANT
        /// </summary>
        MERCHANTEnum = 2,
        
        /// <summary>
        /// Enum PROFILEEnum for PROFILE
        /// </summary>
        PROFILEEnum = 3,
        
        /// <summary>
        /// Enum ASSETGROUPEnum for ASSET_GROUP
        /// </summary>
        ASSETGROUPEnum = 4,
        
        /// <summary>
        /// Enum PINNERLISTEnum for PINNER_LIST
        /// </summary>
        PINNERLISTEnum = 5,
        
        /// <summary>
        /// Enum CONVERSIONTAGEnum for CONVERSION_TAG
        /// </summary>
        CONVERSIONTAGEnum = 6,
        
        /// <summary>
        /// Enum CATALOGEnum for CATALOG
        /// </summary>
        CATALOGEnum = 7,
        
        /// <summary>
        /// Enum CONVERSIONSEGMENTEnum for CONVERSION_SEGMENT
        /// </summary>
        CONVERSIONSEGMENTEnum = 8
    }
