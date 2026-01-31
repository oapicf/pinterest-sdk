package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignId.
  * @param id Campaign ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignId(
  id: Option[String]
)

object CampaignId {
  implicit lazy val campaignIdJsonFormat: Format[CampaignId] = Json.format[CampaignId]
}

