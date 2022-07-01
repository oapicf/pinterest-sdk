package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignResponse.
  * @param id Campaign ID.
  * @param adAccountId Campaign's Advertiser ID.
  * @param name Campaign name.
  * @param lifetimeSpendCap Campaign total spending cap.
  * @param dailySpendCap Campaign daily spending cap.
  * @param orderLineId Order line ID that appears on the invoice.
  * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param createdTime Campaign creation time. Unix timestamp in seconds.
  * @param updatedTime UTC timestamp. Last update time.
  * @param `type` Always \"campaign\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CampaignResponse(
  id: String,
  adAccountId: String,
  name: Option[String],
  status: Option[EntityStatus],
  lifetimeSpendCap: Option[Int],
  dailySpendCap: Option[Int],
  orderLineId: Option[String],
  trackingUrls: Option[TrackingUrls],
  startTime: Option[Int],
  endTime: Option[Int],
  objectiveType: Option[ObjectiveType],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String]
)

object CampaignResponse {
  implicit lazy val campaignResponseJsonFormat: Format[CampaignResponse] = Json.format[CampaignResponse]
}

