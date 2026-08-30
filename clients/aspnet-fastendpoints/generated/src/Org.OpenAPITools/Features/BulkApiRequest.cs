
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class BulkDownloadCreateRequest
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
    public BulkDownloadCreate bulkDownloadCreate { get; set; }
}
public class BulkRequestGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Bulk request ID that is from one of the entities bulk endpoints
    /// </summary>
    [FastEndpoints.BindFrom("bulk_request_id")]
    public string BulkRequestId { get; set; }
    /// <summary>
    /// If set to True then attach the errors/details to all the requests
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include_details")]
    public bool? IncludeDetails { get; set; }
}
public class BulkUpsertCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Parameters to get create/update ad entities in bulk
    /// </summary>
    [FastEndpoints.FromBody]
    public BulkUpsertRequest bulkUpsertRequest { get; set; }
}


