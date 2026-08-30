namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EntityHistory 
{
    public int ChangeTimestamp { get; set; }
    public List<EntityDataChangeHistory> DataChanges { get; set; }
    public string EntityId { get; set; }
    public string EntityName { get; set; }
    public string Ldap { get; set; }
    
    public ChangeHistoryOperationType Operation { get; set; }
    public string UserId { get; set; }
}


