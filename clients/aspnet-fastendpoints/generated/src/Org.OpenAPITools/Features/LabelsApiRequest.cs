
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class LabelsApplyRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Label ID.
    /// </summary>
    [FastEndpoints.BindFrom("label_id")]
    public string LabelId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public LabeledEntitiesCreate labeledEntitiesCreate { get; set; }
}
public class LabelsCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public LabelCreateRequest labelCreateRequest { get; set; }
}
public class LabelsListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// List of Campaign Ids to use to filter the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("campaign_ids")]
    public List<string>? CampaignIds { get; set; }
    /// <summary>
    /// List of Label Ids to use to filter the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("label_ids")]
    public List<string>? LabelIds { get; set; }
    /// <summary>
    /// Label entity status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("entity_statuses")]
    public List<QueryLabelEntityStatusesItems>? EntityStatuses { get; set; }
    /// <summary>
    /// Label type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("label_types")]
    public List<QueryLabelTypesItems>? LabelTypes { get; set; }
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
    /// <summary>
    /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page_size")]
    public int? PageSize { get; set; }
}
public class LabelsRemoveRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Label ID.
    /// </summary>
    [FastEndpoints.BindFrom("label_id")]
    public string LabelId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public LabeledEntitiesCreate labeledEntitiesCreate { get; set; }
}
public class LabelsUpdateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public LabelUpdateRequest labelUpdateRequest { get; set; }
}


