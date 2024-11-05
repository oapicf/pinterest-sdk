package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignResponse.
  * @param id Campaign ID.
  * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  * @param name Campaign name.
  * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  * @param orderLineId Order line ID that appears on the invoice.
  * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param isFlexibleDailyBudgets Determine if a campaign has flexible daily budgets setup.
  * @param createdTime Campaign creation time. Unix timestamp in seconds.
  * @param updatedTime UTC timestamp. Last update time.
  * @param `type` Always \"campaign\".
  * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CampaignResponse(
  id: Option[String],
  adAccountId: Option[String],
  name: Option[String],
  status: Option[EntityStatus],
  lifetimeSpendCap: Option[Int],
  dailySpendCap: Option[Int],
  orderLineId: Option[String],
  trackingUrls: Option[TrackingUrls],
  startTime: Option[Int],
  endTime: Option[Int],
  isFlexibleDailyBudgets: Option[Boolean],
  objectiveType: Option[ObjectiveType],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String],
  isCampaignBudgetOptimization: Option[Boolean],
  summaryStatus: Option[CampaignSummaryStatus]
  additionalProperties: 
)

object CampaignResponse {
  implicit lazy val campaignResponseJsonFormat: Format[CampaignResponse] = {
    val realJsonFormat = Json.format[CampaignResponse]
    val declaredPropNames = Set("id", "adAccountId", "name", "status", "lifetimeSpendCap", "dailySpendCap", "orderLineId", "trackingUrls", "startTime", "endTime", "isFlexibleDailyBudgets", "objectiveType", "createdTime", "updatedTime", "`type`", "isCampaignBudgetOptimization", "summaryStatus")
    
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

