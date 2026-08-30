package api

import play.api.libs.json._
import model.BigDecimal
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.PaginationOrder
import model.ProductGroupAnalyticsItems
import model.ProductGroupPromotion
import model.ProductGroupPromotions
import model.ProductGroupPromotionsCreate
import model.ProductGroupPromotionsList200Response
import model.ProductGroupPromotionsUpdateWithRequiredBody
import model.ReportingColumnSync
import model.ReportingTimeZone

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait ProductGroupPromotionsApi {
  /**
    * Create product group promotions
    * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupPromotionsCreate(adAccountId: String, productGroupPromotionsCreate: ProductGroupPromotionsCreate): ProductGroupPromotions

  /**
    * Get a product group promotion by id
    * Get a product group promotion by id
    * @param adAccountId Unique identifier of an ad account.
    * @param productGroupPromotionId Unique identifier of a product group promotion
    */
  def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String): ProductGroupPromotion

  /**
    * Get product group promotions
    * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param productGroupPromotionIds List of Product group promotion Ids.
    * @param entityStatuses Entity status
    * @param adGroupId Ad group Id.
    */
  def productGroupPromotionsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], productGroupPromotionIds: Option[List[String]], entityStatuses: Option[List[EntityStatus]], adGroupId: Option[String]): ProductGroupPromotionsList200Response

  /**
    * Update product group promotions
    * Update multiple existing Product Group Promotions (by product_group_id)
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody): ProductGroupPromotions

  /**
    * Get product group analytics
    * Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    * @param productGroupIds List of Product group Ids to use to filter the results.
    * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    * @param adAccountId Unique identifier of an ad account.
    * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
  def productGroupsAnalytics(startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String], columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], reportingTimezone: Option[ReportingTimeZone]): List[ProductGroupAnalyticsItems]
}
