namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an item batch record to upsert items
/// </summary>
public class ItemUpsertBatchRecord 
{
    public ItemAttributesRequest Attributes { get; set; }
    public string ItemId { get; set; }
}


