package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaigns_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignsList200Response(
  bookmark: Option[String],
  items: List[Campaign]
)

object CampaignsList200Response {
  implicit lazy val campaignsList200ResponseJsonFormat: Format[CampaignsList200Response] = Json.format[CampaignsList200Response]
}

