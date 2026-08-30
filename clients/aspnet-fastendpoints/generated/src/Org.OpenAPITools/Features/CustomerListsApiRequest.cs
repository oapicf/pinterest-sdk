
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CustomerListsCreateRequest
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
    public CustomerListCreate customerListCreate { get; set; }
}
public class CustomerListsGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Customer list ID.
    /// </summary>
    [FastEndpoints.BindFrom("customer_list_id")]
    public string CustomerListId { get; set; }
}
public class CustomerListsListRequest
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
    /// When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exclude_nca")]
    public bool? ExcludeNca { get; set; }
}
public class CustomerListsUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Customer list ID.
    /// </summary>
    [FastEndpoints.BindFrom("customer_list_id")]
    public string CustomerListId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody { get; set; }
}


