package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignIdFilter.
  * @param campaignIds List of campaign ids
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignIdFilter(
  campaignIds: Option[List[String]]
)

object CampaignIdFilter {
  implicit lazy val campaignIdFilterJsonFormat: Format[CampaignIdFilter] = Json.format[CampaignIdFilter]
}

