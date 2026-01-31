package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignResponse.
  * @param id Campaign ID.
  * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  * @param endTime Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  * @param isAutomatedCampaign Specifies whether the campaign was created in the automated campaign flow
  * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
  * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  * @param name Campaign name.
  * @param orderLineId Order line ID that appears on the invoice.
  * @param startTime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  * @param createdTime Campaign creation time. Unix timestamp in seconds.
  * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
  * @param `type` Always \"campaign\".
  * @param updatedTime UTC timestamp. Last update time.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignResponse(
  id: Option[String],
  adAccountId: Option[String],
  dailySpendCap: Option[Int],
  endTime: Option[Int],
  isAutomatedCampaign: Option[Boolean],
  isFlexibleDailyBudgets: Option[Boolean],
  lifetimeSpendCap: Option[Int],
  name: Option[String],
  orderLineId: Option[String],
  startTime: Option[Int],
  status: Option[EntityStatus],
  trackingUrls: Option[TrackingUrls],
  bidOptions: Option[CampaignBidOptions],
  createdTime: Option[Int],
  isCampaignBudgetOptimization: Option[Boolean],
  isPerformancePlus: Option[Boolean],
  objectiveType: Option[ObjectiveType],
  summaryStatus: Option[CampaignSummaryStatus],
  `type`: Option[String],
  updatedTime: Option[Int]
  additionalProperties: 
)

object CampaignResponse {
  implicit lazy val campaignResponseJsonFormat: Format[CampaignResponse] = {
    val realJsonFormat = Json.format[CampaignResponse]
    val declaredPropNames = Set("id", "adAccountId", "dailySpendCap", "endTime", "isAutomatedCampaign", "isFlexibleDailyBudgets", "lifetimeSpendCap", "name", "orderLineId", "startTime", "status", "trackingUrls", "bidOptions", "createdTime", "isCampaignBudgetOptimization", "isPerformancePlus", "objectiveType", "summaryStatus", "`type`", "updatedTime")
    
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
      Writes { campaignResponse =>
        val jsObj = realJsonFormat.writes(campaignResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

