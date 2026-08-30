package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignCreateRequest.
  * @param isAutomatedCampaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
  * @param isCampaignBudgetOptimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
  * @param isTopOfSearch <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
  * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  * @param defaultAdGroupBudgetInMicroCurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  * @param endTime Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  * @param name Campaign name.
  * @param orderLineId Order line ID that appears on the invoice.
  * @param startTime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignCreateRequest(
  bidOptions: Option[CampaignBidOptionsCreate],
  intendedPromotionType: Option[IntendedPromotionType],
  isAutomatedCampaign: Option[Boolean],
  isCampaignBudgetOptimization: Option[Boolean],
  isFlexibleDailyBudgets: Option[Boolean],
  isLtvOptimized: Option[Boolean],
  isPerformancePlus: Option[Boolean],
  isTopOfSearch: Option[Boolean],
  objectiveType: ObjectiveType,
  status: Option[EntityStatus],
  adAccountId: String,
  dailySpendCap: Option[Int],
  defaultAdGroupBudgetInMicroCurrency: Option[Int],
  endTime: Option[Int],
  lifetimeSpendCap: Option[Int],
  name: String,
  orderLineId: Option[String],
  startTime: Option[Int],
  trackingUrls: Option[JsObject]
  additionalProperties: 
)

object CampaignCreateRequest {
  implicit lazy val campaignCreateRequestJsonFormat: Format[CampaignCreateRequest] = {
    val realJsonFormat = Json.format[CampaignCreateRequest]
    val declaredPropNames = Set("bidOptions", "intendedPromotionType", "isAutomatedCampaign", "isCampaignBudgetOptimization", "isFlexibleDailyBudgets", "isLtvOptimized", "isPerformancePlus", "isTopOfSearch", "objectiveType", "status", "adAccountId", "dailySpendCap", "defaultAdGroupBudgetInMicroCurrency", "endTime", "lifetimeSpendCap", "name", "orderLineId", "startTime", "trackingUrls")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { campaignCreateRequest =>
        val jsObj = realJsonFormat.writes(campaignCreateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

