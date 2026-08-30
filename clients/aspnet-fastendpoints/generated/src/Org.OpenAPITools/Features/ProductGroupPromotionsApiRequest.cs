
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ProductGroupPromotionsCreateRequest
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
    public ProductGroupPromotionsCreate productGroupPromotionsCreate { get; set; }
}
public class ProductGroupPromotionsGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Unique identifier of a product group promotion
    /// </summary>
    [FastEndpoints.BindFrom("product_group_promotion_id")]
    public string ProductGroupPromotionId { get; set; }
}
public class ProductGroupPromotionsListRequest
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
    /// List of Product group promotion Ids.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("product_group_promotion_ids")]
    public List<string>? ProductGroupPromotionIds { get; set; }
    /// <summary>
    /// Entity status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("entity_statuses")]
    public List<EntityStatus>? EntityStatuses { get; set; }
    /// <summary>
    /// Ad group Id.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_group_id")]
    public string? AdGroupId { get; set; }
}
public class ProductGroupPromotionsUpdateRequest
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
    public ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody { get; set; }
}
public class ProductGroupsAnalyticsRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_date")]
    public DateTime StartDate { get; set; }
    /// <summary>
    /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_date")]
    public DateTime EndDate { get; set; }
    /// <summary>
    /// List of Product group Ids to use to filter the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("product_group_ids")]
    public List<string> ProductGroupIds { get; set; }
    /// <summary>
    /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("columns")]
    public List<ReportingColumnSync> Columns { get; set; }
    /// <summary>
    ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("granularity")]
    public Granularity Granularity { get; set; }
    /// <summary>
    /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("click_window_days")]
    public decimal? ClickWindowDays { get; set; }
    /// <summary>
    /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("engagement_window_days")]
    public decimal? EngagementWindowDays { get; set; }
    /// <summary>
    /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("view_window_days")]
    public decimal? ViewWindowDays { get; set; }
    /// <summary>
    /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conversion_report_time")]
    public string? ConversionReportTime { get; set; }
    /// <summary>
    /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reporting_timezone")]
    public ReportingTimeZone ReportingTimezone { get; set; }
}


