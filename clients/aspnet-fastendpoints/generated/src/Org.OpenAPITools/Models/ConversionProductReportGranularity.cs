namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
    /// </summary>
    /// <value>Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly</value>
    public enum ConversionProductReportGranularity
    {
        
        /// <summary>
        /// Enum TOTALEnum for TOTAL
        /// </summary>
        TOTALEnum = 1,
        
        /// <summary>
        /// Enum WEEKEnum for WEEK
        /// </summary>
        WEEKEnum = 2,
        
        /// <summary>
        /// Enum MONTHEnum for MONTH
        /// </summary>
        MONTHEnum = 3
    }
