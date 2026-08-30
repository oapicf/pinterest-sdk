namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Pin 
{
    public AiDisclosures AiDisclosures { get; set; }
    public string BoardId { get; set; }
    public BoardOwner BoardOwner { get; set; }
    public string BoardSectionId { get; set; }
    public DateTime CreatedAt { get; set; }
    
    public CreativeType? CreativeType { get; set; }
    public string DominantColor { get; set; }
    public bool HasBeenPromoted { get; set; }
    public string Id { get; set; }
    public bool IsOwner { get; set; }
    public bool IsProduct { get; set; }
    public bool IsStandard { get; set; }
    public PinMedia Media { get; set; }
    public string ParentPinId { get; set; }
    public Object PinMetrics { get; set; }
    public string AltText { get; set; }
    public string Description { get; set; }
    public string Link { get; set; }
    public string Title { get; set; }
}


