package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BulkDownloadRequest_campaign_filter.
  * @param endTime Unix UTC timestamp.
  * @param name Campaign name
  * @param startTime Unix UTC timestamp.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkDownloadRequestCampaignFilter(
  campaignStatus: Option[List[CampaignSummaryStatus]],
  endTime: Option[String],
  name: Option[String],
  objectiveType: Option[List[ObjectiveType]],
  startTime: Option[String]
)

object BulkDownloadRequestCampaignFilter {
  implicit lazy val bulkDownloadRequestCampaignFilterJsonFormat: Format[BulkDownloadRequestCampaignFilter] = Json.format[BulkDownloadRequestCampaignFilter]
}

