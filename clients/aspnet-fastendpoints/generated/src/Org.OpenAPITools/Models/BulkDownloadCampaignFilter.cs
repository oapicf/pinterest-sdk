namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BulkDownloadCampaignFilter 
{
    public List<SummaryStatus> CampaignStatus { get; set; }
    public string EndTime { get; set; }
    public string Name { get; set; }
    public List<ConversionObjectiveType> ObjectiveType { get; set; }
    public string StartTime { get; set; }
}


