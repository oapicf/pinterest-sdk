namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin with image.
/// </summary>
public class PinMediaWithImage 
{
    public ImageSize Images { get; set; }
    
    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    public enum MediaTypeEnum
    {
        
        /// <summary>
        /// Enum ImageEnum for image
        /// </summary>
        ImageEnum = 1
    }

    public MediaTypeEnum MediaType { get; set; }
}


