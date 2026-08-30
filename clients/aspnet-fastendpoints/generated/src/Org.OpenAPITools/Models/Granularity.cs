namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
    /// </summary>
    /// <value>Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.</value>
    public enum Granularity
    {
        
        /// <summary>
        /// Enum TOTALEnum for TOTAL
        /// </summary>
        TOTALEnum = 1,
        
        /// <summary>
        /// Enum DAYEnum for DAY
        /// </summary>
        DAYEnum = 2,
        
        /// <summary>
        /// Enum HOUREnum for HOUR
        /// </summary>
        HOUREnum = 3,
        
        /// <summary>
        /// Enum WEEKEnum for WEEK
        /// </summary>
        WEEKEnum = 4,
        
        /// <summary>
        /// Enum MONTHEnum for MONTH
        /// </summary>
        MONTHEnum = 5
    }
