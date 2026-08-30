namespace Org.OpenAPITools.Models;


/// <summary>
/// Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
/// </summary>
public class PinMediaMetadata 
{
    public string Description { get; set; }
    public ImageSize Images { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.</value>
    public enum ItemTypeEnum
    {
        
        /// <summary>
        /// Enum VideoEnum for video
        /// </summary>
        VideoEnum = 1
    }

    public ItemTypeEnum ItemType { get; set; }
    public string Link { get; set; }
    public string Title { get; set; }
    public string CoverImageUrl { get; set; }
    public decimal Duration { get; set; }
    public int Height { get; set; }
    public string VideoUrl { get; set; }
    public string VideoUrlHls { get; set; }
    public int Width { get; set; }
}


