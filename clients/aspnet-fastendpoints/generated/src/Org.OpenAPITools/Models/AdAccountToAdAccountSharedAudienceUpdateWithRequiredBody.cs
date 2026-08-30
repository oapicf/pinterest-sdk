namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create or update operation model with required body fields (no OptionalProperties).
/// </summary>
public class AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody 
{
    public string AudienceId { get; set; }
    
    public OperationType OperationType { get; set; }
    public List<string> RecipientAccountIds { get; set; }
}


