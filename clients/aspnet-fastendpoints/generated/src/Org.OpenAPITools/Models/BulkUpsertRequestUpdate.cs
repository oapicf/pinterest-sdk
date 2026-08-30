namespace Org.OpenAPITools.Models;


/// <summary>
/// Request for creation of entities in bulk.
/// </summary>
public class BulkUpsertRequestUpdate 
{
    public List<AdGroupUpdateRequest> AdGroups { get; set; }
    public List<AdUpdateRequest> Ads { get; set; }
    public List<CampaignUpdateRequest> Campaigns { get; set; }
    public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> CatalogProductGroups { get; set; }
    public List<KeywordUpdateGenerated> Keywords { get; set; }
    public List<LabelBulkUpdateRequest> Labels { get; set; }
    public List<ProductGroupPromotionUpdateRequest> ProductGroups { get; set; }
    public List<ScheduleUpdateRequest> Schedules { get; set; }
}


