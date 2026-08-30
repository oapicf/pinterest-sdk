package org.openapitools.api.interfaces;

import org.openapitools.model.AgeTrendsBucket;
import org.openapitools.model.FeaturedTrend;
import org.openapitools.model.GenderBucket;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductCategoriesEngagementType;
import org.openapitools.model.ProductCategoryDetailLookbackWindow;
import org.openapitools.model.ProductCategoryDetails;
import org.openapitools.model.ProductCategoryEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendingProductCategory;
import org.openapitools.model.TrendsAgeBucket;
import org.openapitools.model.TrendsEditorial;
import org.openapitools.model.TrendsGenderFilter;
import org.openapitools.model.TrendsL1Interest;
import org.openapitools.model.TrendsSupportedRegion;
import org.openapitools.model.VerticalProductCategory;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface TrendsService {

    /**
     * List trending keywords
     * Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
     *
     * @param region   The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia (required)
     * @param trendType   The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) (required)
     * @param interests   The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion (optional)
     * @param genders If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. (optional)
     * @param ages If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. (optional)
     * @param includeKeywords If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. (optional)
     * @param normalizeAgainstGroup  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional, default to false)
     * @param limit The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. (optional, default to 50)
     * @param includeDemographics Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data. (optional, default to false)
     * @return TrendingKeywordsResponse
     */
    TrendingKeywordsResponse trendingKeywordsList(
        TrendsSupportedRegion region,
        TrendType trendType,
        List<TrendsL1Interest> interests,
        List<TrendsGenderFilter> genders,
        List<TrendsAgeBucket> ages,
        List<String> includeKeywords,
        Boolean normalizeAgainstGroup,
        Integer limit,
        Boolean includeDemographics
    );

    /**
     * Returns editorial articles for a given region
     *   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
     *
     * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada (required)
     * @return List<TrendsEditorial>
     */
    List<TrendsEditorial> trendsEditorialArticlesList(
        ProductCategoryRegion region
    );

    /**
     * Get featured topics
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     *
     * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada (required)
     * @param interest Interest to filter by (optional)
     * @return List<FeaturedTrend>
     */
    List<FeaturedTrend> trendsFeaturedTopicsList(
        ProductCategoryRegion region,
        InterestsEnum interest
    );

    /**
     * Get product category details
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     *
     * @param productCategories List of product categories (required)
     * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada (required)
     * @param lookbackWindow   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) (optional)
     * @param engagementType     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves (optional)
     * @return List<ProductCategoryDetails>
     */
    List<ProductCategoryDetails> trendsProductCategoriesDetailsList(
        List<ProductCategoryEnum> productCategories,
        ProductCategoryRegion region,
        ProductCategoryDetailLookbackWindow lookbackWindow,
        ProductCategoriesEngagementType engagementType
    );

    /**
     * Get a list of growing Shopping Product Categories
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     *
     * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada (required)
     * @param verticals List of verticals to filter by (optional)
     * @param ages Age to filter by. If not provided, the results will be filtered by all ages. (optional)
     * @param genders Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
     * @param engagementType     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves (optional)
     * @return List<TrendingProductCategory>
     */
    List<TrendingProductCategory> trendsProductCategoriesTrendingList(
        ProductCategoryRegion region,
        List<VerticalProductCategory> verticals,
        List<AgeTrendsBucket> ages,
        List<GenderBucket> genders,
        ProductCategoriesEngagementType engagementType
    );
}
