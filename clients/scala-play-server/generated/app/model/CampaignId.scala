package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignId.
  * @param id Campaign ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CampaignId(
  id: Option[String]
)

object CampaignId {
  implicit lazy val campaignIdJsonFormat: Format[CampaignId] = Json.format[CampaignId]
}

