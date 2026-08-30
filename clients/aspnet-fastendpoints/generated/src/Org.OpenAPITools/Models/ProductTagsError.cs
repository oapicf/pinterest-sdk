namespace Org.OpenAPITools.Models;


/// <summary>
/// Error response for requests containing ineligible product tags.
/// </summary>
public class ProductTagsError 
{
    public int Code { get; set; }
    public IneligibleProductTagsErrorDetails Details { get; set; }
    public string Message { get; set; }
}


