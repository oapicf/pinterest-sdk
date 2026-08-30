namespace Org.OpenAPITools.Models;


/// <summary>
/// Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
/// </summary>
public class BulkUpsertRequest 
{
    public BulkUpsertRequestCreate Create { get; set; }
    public BulkUpsertRequestUpdate Update { get; set; }
}


