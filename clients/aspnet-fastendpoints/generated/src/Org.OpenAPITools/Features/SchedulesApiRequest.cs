
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class SchedulesCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<ScheduleCreate> scheduleCreate { get; set; }
}
public class SchedulesListRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
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
    /// <summary>
    /// The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public PinterestLibPaginationOrder Order { get; set; }
    /// <summary>
    /// Filter schedules by status (one or more)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("schedule_statuses")]
    public List<ScheduleStatus>? ScheduleStatuses { get; set; }
    /// <summary>
    /// Filter schedules by a type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("schedule_type")]
    public ScheduleType ScheduleType { get; set; }
    /// <summary>
    /// List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("entity_ids")]
    public List<string> EntityIds { get; set; }
}
public class SchedulesUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<ScheduleBatchUpdate> scheduleBatchUpdate { get; set; }
}


