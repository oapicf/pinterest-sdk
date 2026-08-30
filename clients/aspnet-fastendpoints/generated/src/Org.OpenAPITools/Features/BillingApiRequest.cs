
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AdsCreditRedeemRequest
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
    public AdsCreditRedeemCreate adsCreditRedeemCreate { get; set; }
}
public class AdsCreditsDiscountsGetRequest
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
}
public class BillingInvoiceDownloadGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Unique identifier of a billing invoice.
    /// </summary>
    [FastEndpoints.BindFrom("billing_invoice_id")]
    public string BillingInvoiceId { get; set; }
}
public class BillingInvoicesGetRequest
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
    /// Field of which to sort billing invoices
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort")]
    public BillingInvoiceSortField Sort { get; set; }
    /// <summary>
    /// Status of billing invoices to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public BillingInvoiceStatus Status { get; set; }
    /// <summary>
    /// Document type of billing invoices to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("document_type")]
    public BillingInvoiceDocumentType DocumentType { get; set; }
    /// <summary>
    /// Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_due_date")]
    public DateTime? StartDueDate { get; set; }
    /// <summary>
    /// Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_due_date")]
    public DateTime? EndDueDate { get; set; }
}
public class BillingProfilesGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Return active billing profiles, if false return all billing profiles.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("is_active")]
    public bool IsActive { get; set; }
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
public class SsioAccountsGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
}
public class SsioInsertionOrderCreateRequest
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
    public SSIOInsertionOrderCreate sSIOInsertionOrderCreate { get; set; }
}
public class SsioInsertionOrderEditRequest
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
    public SSIOInsertionOrderUpdate sSIOInsertionOrderUpdate { get; set; }
}
public class SsioInsertionOrdersStatusGetByAdAccountRequest
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
}
public class SsioInsertionOrdersStatusGetByPinOrderIdRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// The pin order id associated with the ssio insertion order
    /// </summary>
    [FastEndpoints.BindFrom("pin_order_id")]
    public string PinOrderId { get; set; }
}
public class SsioOrderLinesGetByAdAccountRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// The pin order id associated with the SSIO insertion order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_order_id")]
    public string? PinOrderId { get; set; }
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


