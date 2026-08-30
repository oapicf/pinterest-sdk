namespace Org.OpenAPITools.Models;


/// <summary>
/// Image Base64-based media source.
/// </summary>
public class PinMediaSourceImageBase64 
{
    
    public ContentType ContentType { get; set; }
    public string Data { get; set; }
    public bool IsStandard { get; set; } = true;
    
    /// <summary>
    /// The source type of the media.
    /// </summary>
    /// <value>The source type of the media.</value>
    public enum SourceTypeEnum
    {
        
        /// <summary>
        /// Enum ImageBase64Enum for image_base64
        /// </summary>
        ImageBase64Enum = 1
    }

    public SourceTypeEnum SourceType { get; set; }
}


