namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingTemplateUpdateRequestReadOrUpdate 
{
    public string Id { get; set; }
    
    public AudienceUpdateOperationType OperationType { get; set; }
    public TargetingSpecOptimal TargetingAttributes { get; set; }
}


