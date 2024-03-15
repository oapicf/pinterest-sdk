package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaigns_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CampaignsList200Response(
  items: List[CampaignResponse],
  bookmark: Option[String]
)

object CampaignsList200Response {
  implicit lazy val campaignsList200ResponseJsonFormat: Format[CampaignsList200Response] = Json.format[CampaignsList200Response]
}

