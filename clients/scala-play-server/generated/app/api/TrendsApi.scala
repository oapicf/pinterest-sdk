package api

import play.api.libs.json._
import model.AgeTrendsBucket
import model.Error
import model.FeaturedTrend
import model.GenderBucket
import model.InterestsEnum
import model.ProductCategoriesEngagementType
import model.ProductCategoryDetailLookbackWindow
import model.ProductCategoryDetails
import model.ProductCategoryEnum
import model.ProductCategoryRegion
import model.TrendingProductCategory
import model.TrendsEditorial
import model.VerticalProductCategory

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait TrendsApi {
  /**
    * Returns editorial articles for a given region
    *   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
    * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    */
  def trendsEditorialArticlesList(region: ProductCategoryRegion): List[TrendsEditorial]

  /**
    * Get featured topics
    *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
    * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    * @param interest Interest to filter by
    */
  def trendsFeaturedTopicsList(region: ProductCategoryRegion, interest: Option[InterestsEnum]): List[FeaturedTrend]

  /**
    * Get product category details
    *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
    * @param productCategories List of product categories
    * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    * @param lookbackWindow   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)
    * @param engagementType     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
    */
  def trendsProductCategoriesDetailsList(productCategories: List[ProductCategoryEnum], region: ProductCategoryRegion, lookbackWindow: Option[ProductCategoryDetailLookbackWindow], engagementType: Option[ProductCategoriesEngagementType]): List[ProductCategoryDetails]

  /**
    * Get a list of growing Shopping Product Categories
    *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
    * @param region      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    * @param verticals List of verticals to filter by
    * @param ages Age to filter by. If not provided, the results will be filtered by all ages.
    * @param genders Gender to filter by, If not provided, the results will be filtered by all genders.
    * @param engagementType     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
    */
  def trendsProductCategoriesTrendingList(region: ProductCategoryRegion, verticals: Option[List[VerticalProductCategory]], ages: Option[List[AgeTrendsBucket]], genders: Option[List[GenderBucket]], engagementType: Option[ProductCategoriesEngagementType]): List[TrendingProductCategory]
}
