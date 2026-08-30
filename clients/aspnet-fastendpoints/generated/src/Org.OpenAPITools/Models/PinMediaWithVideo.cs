namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin with video.
/// </summary>
public class PinMediaWithVideo 
{
    public string CoverImageUrl { get; set; }
    public decimal Duration { get; set; }
    public int Height { get; set; }
    public ImageSize Images { get; set; }
    
    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    public enum MediaTypeEnum
    {
        
        /// <summary>
        /// Enum VideoEnum for video
        /// </summary>
        VideoEnum = 1
    }

    public MediaTypeEnum MediaType { get; set; }
    public string VideoUrl { get; set; }
    public string VideoUrlHls { get; set; }
    public int Width { get; set; }
}


