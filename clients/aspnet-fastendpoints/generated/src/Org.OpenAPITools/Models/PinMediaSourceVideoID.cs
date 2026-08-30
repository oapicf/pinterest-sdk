namespace Org.OpenAPITools.Models;


/// <summary>
/// Video ID-based media source.
/// </summary>
public class PinMediaSourceVideoID 
{
    
    public ContentType CoverImageContentType { get; set; }
    public string CoverImageData { get; set; }
    public int CoverImageKeyFrameTime { get; set; }
    public string CoverImageUrl { get; set; }
    public bool IsStandard { get; set; } = true;
    public string MediaId { get; set; }
    
    /// <summary>
    /// Gets or Sets SourceType
    /// </summary>
    public enum SourceTypeEnum
    {
        
        /// <summary>
        /// Enum VideoIdEnum for video_id
        /// </summary>
        VideoIdEnum = 1
    }

    public SourceTypeEnum SourceType { get; set; }
}


