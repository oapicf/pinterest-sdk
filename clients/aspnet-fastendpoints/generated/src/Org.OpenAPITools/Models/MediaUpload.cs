namespace Org.OpenAPITools.Models;


/// <summary>
/// Media upload that has been registered but not uploaded/processed yet.
/// </summary>
public class MediaUpload 
{
    public string MediaId { get; set; }
    
    public MediaUploadType MediaType { get; set; }
    public MediaUploadParameters UploadParameters { get; set; }
    public string UploadUrl { get; set; }
}


