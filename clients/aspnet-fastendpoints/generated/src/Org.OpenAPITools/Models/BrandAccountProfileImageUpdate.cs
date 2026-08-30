namespace Org.OpenAPITools.Models;


/// <summary>
/// Base64-encoded image media source
/// </summary>
public class BrandAccountProfileImageUpdate 
{
    
    /// <summary>
    /// Gets or Sets ContentType
    /// </summary>
    public enum ContentTypeEnum
    {
        
        /// <summary>
        /// Enum ImageJpegEnum for image/jpeg
        /// </summary>
        ImageJpegEnum = 1,
        
        /// <summary>
        /// Enum ImagePngEnum for image/png
        /// </summary>
        ImagePngEnum = 2
    }

    public ContentTypeEnum ContentType { get; set; }
    public string Data { get; set; }
}


