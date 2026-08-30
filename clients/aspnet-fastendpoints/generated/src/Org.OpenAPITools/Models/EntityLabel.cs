namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EntityLabel 
{
    public string EntityId { get; set; }
    
    public LabelParentType? EntityType { get; set; }
    public string LabelId { get; set; }
    
    public EntityLabelStatus? Status { get; set; }
}


