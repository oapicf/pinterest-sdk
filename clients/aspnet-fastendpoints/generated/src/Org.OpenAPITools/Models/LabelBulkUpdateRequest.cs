namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LabelBulkUpdateRequest 
{
    public string Id { get; set; }
    public string ParentId { get; set; }
    
    public LabelStatusBulkUpdate Status { get; set; }
}


