
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AdAccountsAudiencesSharedAccountsListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Unique identifier of the audience to use to filter the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audience_id")]
    public string AudienceId { get; set; }
    /// <summary>
    /// Filter accounts by account type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("account_type")]
    public AudienceAccountType AccountType { get; set; }
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
public class BusinessAccountAudiencesSharedAccountsListRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// Unique identifier of the audience to use to filter the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audience_id")]
    public string AudienceId { get; set; }
    /// <summary>
    /// Filter accounts by account type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("account_type")]
    public AudienceAccountType AccountType { get; set; }
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
public class SharedAudiencesForBusinessListRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public Order Order { get; set; }
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
public class UpdateAdAccountToAdAccountSharedAudienceRequest
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
    public AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody { get; set; }
}
public class UpdateAdAccountToBusinessSharedAudienceRequest
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
    public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody { get; set; }
}
public class UpdateBusinessToAdAccountSharedAudienceRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody { get; set; }
}
public class UpdateBusinessToBusinessSharedAudienceRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody { get; set; }
}


