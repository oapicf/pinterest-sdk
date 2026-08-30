namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
/// </summary>
public class PinMediaSourcePinURL 
{
    public bool IsAffiliateLink { get; set; } = false;
    
    /// <summary>
    /// Gets or Sets SourceType
    /// </summary>
    public enum SourceTypeEnum
    {
        
        /// <summary>
        /// Enum PinUrlEnum for pin_url
        /// </summary>
        PinUrlEnum = 1
    }

    public SourceTypeEnum SourceType { get; set; }
}


