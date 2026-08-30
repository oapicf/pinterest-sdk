namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ImageMetadata 
{
    public string Description { get; set; }
    public ImageSize Images { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.</value>
    public enum ItemTypeEnum
    {
        
        /// <summary>
        /// Enum ImageEnum for image
        /// </summary>
        ImageEnum = 1
    }

    public ItemTypeEnum ItemType { get; set; }
    public string Link { get; set; }
    public string Title { get; set; }
}


