namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class PinCreate 
{
    public AiDisclosures AiDisclosures { get; set; }
    public string AltText { get; set; }
    public string BoardId { get; set; }
    public string BoardSectionId { get; set; }
    public string Description { get; set; }
    public string DominantColor { get; set; }
    public string Link { get; set; }
    public PinMediaSource MediaSource { get; set; }
    public string ParentPinId { get; set; }
    public string SponsorId { get; set; }
    public string Title { get; set; }
}


