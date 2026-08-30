namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin with multiple images.
/// </summary>
public class PinMediaWithImages 
{
    public List<ImageMetadata> Items { get; set; }
    
    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    public enum MediaTypeEnum
    {
        
        /// <summary>
        /// Enum MultipleImagesEnum for multiple_images
        /// </summary>
        MultipleImagesEnum = 1
    }

    public MediaTypeEnum MediaType { get; set; }
}


