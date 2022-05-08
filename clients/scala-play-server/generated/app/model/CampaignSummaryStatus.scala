package model

import play.api.libs.json._

/**
  * Summary status for campaign
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CampaignSummaryStatus(
)

object CampaignSummaryStatus {
  implicit lazy val campaignSummaryStatusJsonFormat: Format[CampaignSummaryStatus] = Json.format[CampaignSummaryStatus]
}

