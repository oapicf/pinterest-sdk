namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class BulkDownloadCreate 
{
    public BulkDownloadCampaignFilter CampaignFilter { get; set; }
    public List<string> EntityIds { get; set; }
    public List<BulkEntityType> EntityTypes { get; set; }
    
    public BulkOutputFormat OutputFormat { get; set; }
    public string UpdatedSince { get; set; }
}


