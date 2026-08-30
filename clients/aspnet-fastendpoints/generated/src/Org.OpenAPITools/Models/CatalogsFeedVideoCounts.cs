namespace Org.OpenAPITools.Models;


/// <summary>
/// Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
/// </summary>
public class CatalogsFeedVideoCounts 
{
    public int IngestedVideos { get; set; }
    public int NotIngestedVideos { get; set; }
    public int TotalVideos { get; set; }
}


