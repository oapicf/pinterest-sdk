namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CampaignAdPreviewDelete200ResponseInnerStatus 
{
    
    /// <summary>
    /// Gets or Sets StatusCode
    /// </summary>
    public enum StatusCodeEnum
    {
        
        /// <summary>
        /// Enum _204Enum for 204
        /// </summary>
        _204Enum = 1
    }

    public StatusCodeEnum StatusCode { get; set; }
    public int Code { get; set; }
    public string Message { get; set; }
}


