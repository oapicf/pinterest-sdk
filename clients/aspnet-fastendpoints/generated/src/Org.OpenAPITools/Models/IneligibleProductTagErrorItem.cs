namespace Org.OpenAPITools.Models;


/// <summary>
/// Error item for a product tag that failed eligibility check.
/// </summary>
public class IneligibleProductTagErrorItem 
{
    
    public IneligibleProductTagReason ErrorMessage { get; set; }
    public string PinId { get; set; }
}


