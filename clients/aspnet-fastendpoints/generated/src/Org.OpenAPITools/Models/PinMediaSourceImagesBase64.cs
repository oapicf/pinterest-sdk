namespace Org.OpenAPITools.Models;


/// <summary>
/// Multiple Base64-based images media source
/// </summary>
public class PinMediaSourceImagesBase64 
{
    public int Index { get; set; }
    public List<PinMediaSourceImagesBase64Item> Items { get; set; }
    
    /// <summary>
    /// The source type of the media.
    /// </summary>
    /// <value>The source type of the media.</value>
    public enum SourceTypeEnum
    {
        
        /// <summary>
        /// Enum MultipleImageBase64Enum for multiple_image_base64
        /// </summary>
        MultipleImageBase64Enum = 1
    }

    public SourceTypeEnum SourceType { get; set; }
}


