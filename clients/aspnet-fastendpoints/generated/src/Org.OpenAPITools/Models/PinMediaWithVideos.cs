namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin with multiple videos.
/// </summary>
public class PinMediaWithVideos 
{
    public List<VideoMetadataWithItemType> Items { get; set; }
    
    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    public enum MediaTypeEnum
    {
        
        /// <summary>
        /// Enum MultipleVideosEnum for multiple_videos
        /// </summary>
        MultipleVideosEnum = 1
    }

    public MediaTypeEnum MediaType { get; set; }
}


