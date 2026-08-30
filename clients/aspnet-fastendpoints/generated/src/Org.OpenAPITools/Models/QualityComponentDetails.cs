namespace Org.OpenAPITools.Models;


/// <summary>
/// Metrics for a specific event type within a quality component.
/// </summary>
public class QualityComponentDetails 
{
    public decimal Coverage { get; set; }
    public List<QualityComponentIssue> Issues { get; set; }
    public decimal Overlap { get; set; }
}


