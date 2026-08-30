namespace Org.OpenAPITools.Models;


/// <summary>
/// Pin media source that can be an image, video, or a mix of both passed in as a request.
/// </summary>
public class PinMediaSource 
{
    
    public ContentType ContentType { get; set; }
    public string Data { get; set; }
    public bool IsStandard { get; set; } = true;
    
    /// <summary>
    /// Gets or Sets SourceType
    /// </summary>
    public enum SourceTypeEnum
    {
        
        /// <summary>
        /// Enum PinUrlEnum for pin_url
        /// </summary>
        PinUrlEnum = 1
    }

    public SourceTypeEnum SourceType { get; set; }
    public string Url { get; set; }
    
    public ContentType CoverImageContentType { get; set; }
    public string CoverImageData { get; set; }
    public int CoverImageKeyFrameTime { get; set; }
    public string CoverImageUrl { get; set; }
    public string MediaId { get; set; }
    public int Index { get; set; }
    public List<PinMediaSourceImagesURLItem> Items { get; set; }
    public bool IsAffiliateLink { get; set; } = false;
}


