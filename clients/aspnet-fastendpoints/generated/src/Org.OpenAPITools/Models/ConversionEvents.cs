namespace Org.OpenAPITools.Models;


/// <summary>
/// Conversion events.
/// </summary>
public class ConversionEvents 
{
    public List<ConversionApiResponseEventsItems> Events { get; set; }
    public int NumEventsProcessed { get; set; }
    public int NumEventsReceived { get; set; }
}


