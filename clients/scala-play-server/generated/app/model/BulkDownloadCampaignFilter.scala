package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BulkDownloadCampaignFilter.
  * @param endTime Unix UTC timestamp.
  * @param name Campaign name
  * @param startTime Unix UTC timestamp.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BulkDownloadCampaignFilter(
  campaignStatus: Option[List[SummaryStatus]],
  endTime: Option[String],
  name: Option[String],
  objectiveType: Option[List[ConversionObjectiveType]],
  startTime: Option[String]
)

object BulkDownloadCampaignFilter {
  implicit lazy val bulkDownloadCampaignFilterJsonFormat: Format[BulkDownloadCampaignFilter] = Json.format[BulkDownloadCampaignFilter]
}

