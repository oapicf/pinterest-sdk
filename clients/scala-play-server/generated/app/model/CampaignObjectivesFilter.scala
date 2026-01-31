package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignObjectivesFilter.
  * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignObjectivesFilter(
  campaignObjectiveTypes: Option[List[ObjectiveType]]
)

object CampaignObjectivesFilter {
  implicit lazy val campaignObjectivesFilterJsonFormat: Format[CampaignObjectivesFilter] = Json.format[CampaignObjectivesFilter]
}

