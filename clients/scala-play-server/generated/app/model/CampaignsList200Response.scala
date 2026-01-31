package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaigns_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignsList200Response(
  bookmark: Option[String],
  items: List[CampaignResponse]
)

object CampaignsList200Response {
  implicit lazy val campaignsList200ResponseJsonFormat: Format[CampaignsList200Response] = Json.format[CampaignsList200Response]
}

