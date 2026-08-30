namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
    /// </summary>
    /// <value>Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.</value>
    public enum CustomerListStatus
    {
        
        /// <summary>
        /// Enum PROCESSINGEnum for PROCESSING
        /// </summary>
        PROCESSINGEnum = 1,
        
        /// <summary>
        /// Enum READYEnum for READY
        /// </summary>
        READYEnum = 2,
        
        /// <summary>
        /// Enum TOOSMALLEnum for TOO_SMALL
        /// </summary>
        TOOSMALLEnum = 3,
        
        /// <summary>
        /// Enum UPLOADINGEnum for UPLOADING
        /// </summary>
        UPLOADINGEnum = 4
    }
