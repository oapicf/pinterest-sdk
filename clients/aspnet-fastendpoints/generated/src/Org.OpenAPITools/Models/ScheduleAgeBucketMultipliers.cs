namespace Org.OpenAPITools.Models;


/// <summary>
/// This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
/// </summary>
public class ScheduleAgeBucketMultipliers 
{
    
    /// <summary>
    /// Gets or Sets AGE_BUCKET
    /// </summary>
    public enum AGEBUCKETEnum
    {
        
        /// <summary>
        /// Enum _1824Enum for 18-24
        /// </summary>
        _1824Enum = 1,
        
        /// <summary>
        /// Enum _2534Enum for 25-34
        /// </summary>
        _2534Enum = 2,
        
        /// <summary>
        /// Enum _3544Enum for 35-44
        /// </summary>
        _3544Enum = 3,
        
        /// <summary>
        /// Enum _4549Enum for 45-49
        /// </summary>
        _4549Enum = 4,
        
        /// <summary>
        /// Enum _5054Enum for 50-54
        /// </summary>
        _5054Enum = 5,
        
        /// <summary>
        /// Enum _5564Enum for 55-64
        /// </summary>
        _5564Enum = 6,
        
        /// <summary>
        /// Enum _65Enum for 65+
        /// </summary>
        _65Enum = 7
    }

    public AGEBUCKETEnum AGE_BUCKET { get; set; }
}


