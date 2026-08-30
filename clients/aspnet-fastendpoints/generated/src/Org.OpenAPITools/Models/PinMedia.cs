namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin media that can be an image, video, or a mix of both.
/// </summary>
public class PinMedia 
{
    public ImageSize Images { get; set; }
    
    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    public enum MediaTypeEnum
    {
        
        /// <summary>
        /// Enum MultipleMixedEnum for multiple_mixed
        /// </summary>
        MultipleMixedEnum = 1
    }

    public MediaTypeEnum MediaType { get; set; }
    public string CoverImageUrl { get; set; }
    public decimal Duration { get; set; }
    public int Height { get; set; }
    public string VideoUrl { get; set; }
    public string VideoUrlHls { get; set; }
    public int Width { get; set; }
    public List<PinMediaMetadata> Items { get; set; }
}


