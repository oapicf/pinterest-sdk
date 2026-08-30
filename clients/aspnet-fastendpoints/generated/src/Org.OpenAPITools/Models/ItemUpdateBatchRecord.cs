namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an item batch record to update items
/// </summary>
public class ItemUpdateBatchRecord 
{
    public UpdatableItemAttributes Attributes { get; set; }
    public string ItemId { get; set; }
    public List<UpdateMaskFieldType> UpdateMask { get; set; }
}


