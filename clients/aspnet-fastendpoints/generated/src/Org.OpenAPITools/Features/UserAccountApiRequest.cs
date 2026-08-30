
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class BoardsUserFollowsListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("explicit_following")]
    public bool? ExplicitFollowing { get; set; }
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
public class FollowUserUpdateRequest
{
    /// <summary>
    /// A valid username
    /// </summary>
    [FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public FollowUserCreate followUserCreate { get; set; }
}
public class FollowersListRequest
{
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
public class LinkedBusinessAccountsGetRequest
{
}
public class UnverifyWebsiteDeleteRequest
{
    /// <summary>
    /// Website with path or domain only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("website")]
    public string Website { get; set; }
}
public class UserAccountAnalyticsRequest
{
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
    /// Filter on Pins that match your claimed domain.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("from_claimed_content")]
    public string? FromClaimedContent { get; set; }
    /// <summary>
    /// Pin formats to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_format")]
    public string? PinFormat { get; set; }
    /// <summary>
    /// Apps or devices to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app_types")]
    public string? AppTypes { get; set; }
    /// <summary>
    /// Filter to paid or organic data. Default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("content_type")]
    public string? ContentType { get; set; }
    /// <summary>
    /// Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("source")]
    public string? Source { get; set; }
    /// <summary>
    /// Metric types to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metric_types")]
    public List<QuerymetrictypesItems>? MetricTypes { get; set; }
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
public class UserAccountAnalyticsTopPinsRequest
{
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
    /// Specify sorting order for metrics
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort_by")]
    public TopPinsSortBy SortBy { get; set; }
    /// <summary>
    /// Filter on Pins that match your claimed domain.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("from_claimed_content")]
    public string? FromClaimedContent { get; set; }
    /// <summary>
    /// Pin formats to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_format")]
    public string? PinFormat { get; set; }
    /// <summary>
    /// Apps or devices to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app_types")]
    public string? AppTypes { get; set; }
    /// <summary>
    /// Filter to paid or organic data. Default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("content_type")]
    public string? ContentType { get; set; }
    /// <summary>
    /// Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("source")]
    public string? Source { get; set; }
    /// <summary>
    /// Metric types to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metric_types")]
    public List<QuerymetrictypesItems>? MetricTypes { get; set; }
    /// <summary>
    /// Number of pins to include, default is 10. Max is 50.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("num_of_pins")]
    public int? NumOfPins { get; set; }
    /// <summary>
    /// Get metrics for pins created in the last \&quot;n\&quot; days.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("created_in_last_n_days")]
    public decimal? CreatedInLastNDays { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class UserAccountAnalyticsTopVideoPinsRequest
{
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
    /// Specify sorting order for video metrics
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort_by")]
    public TopVideoPinsSortBy SortBy { get; set; }
    /// <summary>
    /// Filter on Pins that match your claimed domain.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("from_claimed_content")]
    public string? FromClaimedContent { get; set; }
    /// <summary>
    /// Pin formats to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_format")]
    public string? PinFormat { get; set; }
    /// <summary>
    /// Apps or devices to get data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app_types")]
    public string? AppTypes { get; set; }
    /// <summary>
    /// Filter to paid or organic data. Default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("content_type")]
    public string? ContentType { get; set; }
    /// <summary>
    /// Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("source")]
    public string? Source { get; set; }
    /// <summary>
    /// Metric types to get video data for, default is all.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metric_types")]
    public List<QueryvideopinmetrictypesItems>? MetricTypes { get; set; }
    /// <summary>
    /// Number of pins to include, default is 10. Max is 50.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("num_of_pins")]
    public int? NumOfPins { get; set; }
    /// <summary>
    /// Get metrics for pins created in the last \&quot;n\&quot; days.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("created_in_last_n_days")]
    public decimal? CreatedInLastNDays { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class UserAccountFollowedInterestsRequest
{
    /// <summary>
    /// A valid username
    /// </summary>
    [FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
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
public class UserAccountGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class UserFollowingGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("explicit_following")]
    public bool? ExplicitFollowing { get; set; }
    /// <summary>
    /// Thrift param specifying what type of followees will be kept. Default to include all followees.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("feed_type")]
    public UserFollowingFeedType FeedType { get; set; }
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
public class UserWebsitesGetRequest
{
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
public class VerifyWebsiteUpdateRequest
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
    public UserWebsiteCreate userWebsiteCreate { get; set; }
}
public class WebsiteVerificationGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}


