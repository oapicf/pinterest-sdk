namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
    /// </summary>
    /// <value>Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.</value>
    public enum ConversionDeletionRequestStatus
    {
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 1,
        
        /// <summary>
        /// Enum SUBMITTEDEnum for SUBMITTED
        /// </summary>
        SUBMITTEDEnum = 2,
        
        /// <summary>
        /// Enum CANCELLEDEnum for CANCELLED
        /// </summary>
        CANCELLEDEnum = 3
    }
