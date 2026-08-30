namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create or update operation model with required body fields (no OptionalProperties).
/// </summary>
public class CustomerSegmentUpdateRequestUpdateWithRequiredBody 
{
    public List<string> AudienceIds { get; set; }
    public string Id { get; set; }
    
    public AudienceUpdateOperationType OperationType { get; set; }
}


