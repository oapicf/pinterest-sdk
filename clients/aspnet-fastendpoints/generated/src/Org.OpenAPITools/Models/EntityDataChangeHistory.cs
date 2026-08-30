namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EntityDataChangeHistory 
{
    public string ChangedFieldId { get; set; }
    public string ChangedFieldName { get; set; }
    
    public ChangeHistoryDataType DataType { get; set; }
    public string NewDataValue { get; set; }
    public string OldDataValue { get; set; }
}


