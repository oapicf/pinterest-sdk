namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class VideoMetadataWithItemType 
{
    public string CoverImageUrl { get; set; }
    public decimal Duration { get; set; }
    public int Height { get; set; }
    
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
    public string VideoUrl { get; set; }
    public string VideoUrlHls { get; set; }
    public int Width { get; set; }
}


