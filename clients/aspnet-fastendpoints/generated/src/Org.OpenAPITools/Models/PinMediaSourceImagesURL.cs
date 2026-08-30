namespace Org.OpenAPITools.Models;


/// <summary>
/// Multiple URL-based images media source
/// </summary>
public class PinMediaSourceImagesURL 
{
    public int Index { get; set; }
    public List<PinMediaSourceImagesURLItem> Items { get; set; }
    
    /// <summary>
    /// The source type of the media.
    /// </summary>
    /// <value>The source type of the media.</value>
    public enum SourceTypeEnum
    {
        
        /// <summary>
        /// Enum MultipleImageUrlsEnum for multiple_image_urls
        /// </summary>
        MultipleImageUrlsEnum = 1
    }

    public SourceTypeEnum SourceType { get; set; }
}


