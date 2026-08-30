namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Reason why a product pin is ineligible for tagging.
    /// </summary>
    /// <value>Reason why a product pin is ineligible for tagging.</value>
    public enum IneligibleProductTagReason
    {
        
        /// <summary>
        /// Enum PINMISSINGEnum for PIN_MISSING
        /// </summary>
        PINMISSINGEnum = 1,
        
        /// <summary>
        /// Enum PINISPRIVATEEnum for PIN_IS_PRIVATE
        /// </summary>
        PINISPRIVATEEnum = 2,
        
        /// <summary>
        /// Enum PRODUCTMETADATAMISSINGEnum for PRODUCT_METADATA_MISSING
        /// </summary>
        PRODUCTMETADATAMISSINGEnum = 3,
        
        /// <summary>
        /// Enum PINNOTFROMVERIFIEDDOMAINEnum for PIN_NOT_FROM_VERIFIED_DOMAIN
        /// </summary>
        PINNOTFROMVERIFIEDDOMAINEnum = 4,
        
        /// <summary>
        /// Enum PINNOTFROMSAMEUSERASHEROPINEnum for PIN_NOT_FROM_SAME_USER_AS_HERO_PIN
        /// </summary>
        PINNOTFROMSAMEUSERASHEROPINEnum = 5
    }
