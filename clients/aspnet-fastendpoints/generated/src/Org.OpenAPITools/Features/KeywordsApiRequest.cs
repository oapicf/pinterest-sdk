
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CountryKeywordsMetricsGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Two letter country code (ISO 3166-1 alpha-2)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country_code")]
    public string CountryCode { get; set; }
    /// <summary>
    /// Comma-separated keywords
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keywords")]
    public List<string> Keywords { get; set; }
}
public class KeywordsCreateRequest
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
    public KeywordsCreate keywordsCreate { get; set; }
}
public class KeywordsGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Campaign Id to use to filter the results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("campaign_id")]
    public string? CampaignId { get; set; }
    /// <summary>
    /// Ad group Id.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_group_id")]
    public string? AdGroupId { get; set; }
    /// <summary>
    /// List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_group_ids")]
    public List<string>? AdGroupIds { get; set; }
    /// <summary>
    /// Keyword [match type](/docs/api-features/targeting-overview/)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("match_types")]
    public List<MatchType>? MatchTypes { get; set; }
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
public class KeywordsUpdateRequest
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
    public KeywordsUpdate keywordsUpdate { get; set; }
}
public class TrendingKeywordsListRequest
{
    /// <summary>
    ///   The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia
    /// </summary>
    [FastEndpoints.BindFrom("region")]
    public TrendsSupportedRegion Region { get; set; }
    /// <summary>
    ///   The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
    /// </summary>
    [FastEndpoints.BindFrom("trend_type")]
    public TrendType TrendType { get; set; }
    /// <summary>
    ///   The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("interests")]
    public List<TrendsL1Interest>? Interests { get; set; }
    /// <summary>
    /// If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("genders")]
    public List<TrendsGenderFilter>? Genders { get; set; }
    /// <summary>
    /// If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ages")]
    public List<TrendsAgeBucket>? Ages { get; set; }
    /// <summary>
    /// If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include_keywords")]
    public List<string>? IncludeKeywords { get; set; }
    /// <summary>
    ///  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("normalize_against_group")]
    public bool? NormalizeAgainstGroup { get; set; }
    /// <summary>
    /// The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include_demographics")]
    public bool? IncludeDemographics { get; set; }
}


