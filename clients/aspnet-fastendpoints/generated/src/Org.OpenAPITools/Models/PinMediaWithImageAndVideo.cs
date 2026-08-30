namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin with a mix of images and videos.
/// </summary>
public class PinMediaWithImageAndVideo 
{
    public List<PinMediaMetadata> Items { get; set; }
    
    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    public enum MediaTypeEnum
    {
        
        /// <summary>
        /// Enum MultipleMixedEnum for multiple_mixed
        /// </summary>
        MultipleMixedEnum = 1
    }

    public MediaTypeEnum MediaType { get; set; }
}


