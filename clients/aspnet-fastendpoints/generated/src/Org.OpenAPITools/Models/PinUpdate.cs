namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create or update operation model.
/// </summary>
public class PinUpdate 
{
    public AiDisclosuresUpdate AiDisclosures { get; set; }
    public string AltText { get; set; }
    public string BoardId { get; set; }
    public string BoardSectionId { get; set; }
    public List<CarouselSlot> CarouselSlots { get; set; }
    public string Description { get; set; }
    public string Link { get; set; }
    public string Title { get; set; }
}


