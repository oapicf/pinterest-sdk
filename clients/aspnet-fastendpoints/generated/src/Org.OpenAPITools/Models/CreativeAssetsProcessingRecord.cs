namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an item processing record
/// </summary>
public class CreativeAssetsProcessingRecord 
{
    public string CreativeAssetsId { get; set; }
    public List<ItemValidationEvent> Errors { get; set; }
    
    public ItemProcessingStatus Status { get; set; }
    public List<ItemValidationEvent> Warnings { get; set; }
}


