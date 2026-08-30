namespace Org.OpenAPITools.Models;


/// <summary>
/// Request for creation of entities in bulk.
/// </summary>
public class BulkUpsertRequestCreate 
{
    public List<AdGroupCreateRequest> AdGroups { get; set; }
    public List<AdCreateRequest> Ads { get; set; }
    public List<CampaignCreateRequest> Campaigns { get; set; }
    public List<BulkUpsertRequestCreateCatalogProductGroupsItems> CatalogProductGroups { get; set; }
    public List<KeywordsRequest> Keywords { get; set; }
    public List<LabelBulkCreateRequest> Labels { get; set; }
    public List<ProductGroupPromotionCreateRequest> ProductGroups { get; set; }
    public List<ScheduleCreateRequest> Schedules { get; set; }
}


