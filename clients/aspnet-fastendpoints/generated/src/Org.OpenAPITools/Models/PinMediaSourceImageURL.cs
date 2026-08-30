namespace Org.OpenAPITools.Models;


/// <summary>
/// Image URL-based media source.
/// </summary>
public class PinMediaSourceImageURL 
{
    public bool IsStandard { get; set; } = true;
    
    /// <summary>
    /// The source type of the media.
    /// </summary>
    /// <value>The source type of the media.</value>
    public enum SourceTypeEnum
    {
        
        /// <summary>
        /// Enum ImageUrlEnum for image_url
        /// </summary>
        ImageUrlEnum = 1
    }

    public SourceTypeEnum SourceType { get; set; }
    public string Url { get; set; }
}


