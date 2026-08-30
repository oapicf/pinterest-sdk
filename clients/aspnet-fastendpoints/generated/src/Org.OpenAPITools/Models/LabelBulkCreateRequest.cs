namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LabelBulkCreateRequest 
{
    public List<LabelCreateItem> Labels { get; set; }
    public string ParentId { get; set; }
}


