
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class TrendsEditorialArticlesListRequest
{
    /// <summary>
    ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("region")]
    public ProductCategoryRegion Region { get; set; }
}
public class TrendsFeaturedTopicsListRequest
{
    /// <summary>
    /// Interest to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("interest")]
    public InterestsEnum Interest { get; set; }
    /// <summary>
    ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("region")]
    public ProductCategoryRegion Region { get; set; }
}
public class TrendsProductCategoriesDetailsListRequest
{
    /// <summary>
    /// List of product categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("product_categories")]
    public List<ProductCategoryEnum> ProductCategories { get; set; }
    /// <summary>
    ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("region")]
    public ProductCategoryRegion Region { get; set; }
    /// <summary>
    ///   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lookback_window")]
    public ProductCategoryDetailLookbackWindow LookbackWindow { get; set; }
    /// <summary>
    ///     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("engagement_type")]
    public ProductCategoriesEngagementType EngagementType { get; set; }
}
public class TrendsProductCategoriesTrendingListRequest
{
    /// <summary>
    ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("region")]
    public ProductCategoryRegion Region { get; set; }
    /// <summary>
    /// List of verticals to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("verticals")]
    public List<VerticalProductCategory>? Verticals { get; set; }
    /// <summary>
    /// Age to filter by. If not provided, the results will be filtered by all ages.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ages")]
    public List<AgeTrendsBucket>? Ages { get; set; }
    /// <summary>
    /// Gender to filter by, If not provided, the results will be filtered by all genders.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("genders")]
    public List<GenderBucket>? Genders { get; set; }
    /// <summary>
    ///     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("engagement_type")]
    public ProductCategoriesEngagementType EngagementType { get; set; }
}


