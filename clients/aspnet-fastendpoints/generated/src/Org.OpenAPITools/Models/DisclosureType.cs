namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
    /// </summary>
    /// <value>Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.</value>
    public enum DisclosureType
    {
        
        /// <summary>
        /// Enum NODISCLOSUREEnum for NO_DISCLOSURE
        /// </summary>
        NODISCLOSUREEnum = 1,
        
        /// <summary>
        /// Enum PRESCRIBINGINFORMATIONEnum for PRESCRIBING_INFORMATION
        /// </summary>
        PRESCRIBINGINFORMATIONEnum = 2,
        
        /// <summary>
        /// Enum PRESCRIBINGINFORMATIONBOXWARNINGEnum for PRESCRIBING_INFORMATION_BOX_WARNING
        /// </summary>
        PRESCRIBINGINFORMATIONBOXWARNINGEnum = 3,
        
        /// <summary>
        /// Enum IMPORTANTSAFETYINFOEnum for IMPORTANT_SAFETY_INFO
        /// </summary>
        IMPORTANTSAFETYINFOEnum = 4,
        
        /// <summary>
        /// Enum MEDGUIDEEnum for MED_GUIDE
        /// </summary>
        MEDGUIDEEnum = 5,
        
        /// <summary>
        /// Enum PATIENTINFORMATIONEnum for PATIENT_INFORMATION
        /// </summary>
        PATIENTINFORMATIONEnum = 6
    }
