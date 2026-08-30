
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class MultiPinsAnalyticsRequest
{
    /// <summary>
    /// List of Pin IDs.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_ids")]
    public List<string> PinIds { get; set; }
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
    /// Apps or devices to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app_types")]
    public string? AppTypes { get; set; }
    /// <summary>
    /// Pin metric types to get data for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metric_types")]
    public List<MultiPinsAnalyticsMetricTypesItem> MetricTypes { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class PinsAnalyticsRequest
{
    /// <summary>
    /// Unique identifier of a Pin.
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
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
    /// Apps or devices to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app_types")]
    public string? AppTypes { get; set; }
    /// <summary>
    /// Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metric_types")]
    public List<QuerypinanalyticsmetrictypesItems> MetricTypes { get; set; }
    /// <summary>
    /// How to split the data into groups. Not including this param means data won&#39;t be split.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("split_field")]
    public string? SplitField { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class PinsCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public PinCreate pinCreate { get; set; }
}
public class PinsDeleteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class PinsGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_metrics")]
    public bool? PinMetrics { get; set; }
}
public class PinsListRequest
{
    /// <summary>
    /// The filter to apply to the pins
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_filter")]
    public PinFilter PinFilter { get; set; }
    /// <summary>
    /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_metrics")]
    public bool? PinMetrics { get; set; }
    /// <summary>
    /// Whether to include protected pins in the results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include_protected_pins")]
    public bool? IncludeProtectedPins { get; set; }
    /// <summary>
    /// The type of pins to return, currently only enabled for private pins
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_type")]
    public PinType PinType { get; set; }
    /// <summary>
    /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creative_types")]
    public List<CreativeType>? CreativeTypes { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("domain")]
    public string? Domain { get; set; }
    /// <summary>
    /// Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("domains")]
    public List<string>? Domains { get; set; }
    /// <summary>
    /// Include product tag objects in the response with their associated links.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include_product_tag_obj")]
    public bool? IncludeProductTagObj { get; set; }
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
public class PinsSaveRequest
{
    /// <summary>
    /// Unique identifier of a Pin.
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public PinsSaveRequestCreate pinsSaveRequestCreate { get; set; }
}
public class PinsUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public PinUpdate pinUpdate { get; set; }
}


