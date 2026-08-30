namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an item processing record
/// </summary>
public class HotelProcessingRecord 
{
    public List<ItemValidationEvent> Errors { get; set; }
    public string HotelId { get; set; }
    
    public ItemProcessingStatus Status { get; set; }
    public List<ItemValidationEvent> Warnings { get; set; }
}


