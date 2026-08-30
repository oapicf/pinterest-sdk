
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AudiencesCreateRequest
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
    public AdAccountsAudienceCreate adAccountsAudienceCreate { get; set; }
}
public class AudiencesGetRequest
{
    /// <summary>
    /// Audience ID.
    /// </summary>
    [FastEndpoints.BindFrom("audience_id")]
    public string AudienceId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
}
public class AudiencesListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
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
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownership_type")]
    public AudienceOwnershipType OwnershipType { get; set; }
    /// <summary>
    /// When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exclude_nca")]
    public bool? ExcludeNca { get; set; }
}
public class AudiencesUpdateRequest
{
    /// <summary>
    /// Audience ID.
    /// </summary>
    [FastEndpoints.BindFrom("audience_id")]
    public string AudienceId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public AdAccountsAudienceUpdate adAccountsAudienceUpdate { get; set; }
}


