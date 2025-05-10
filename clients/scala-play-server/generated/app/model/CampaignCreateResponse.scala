package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignCreateResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CampaignCreateResponse(
  items: Option[List[CampaignCreateResponseItem]]
)

object CampaignCreateResponse {
  implicit lazy val campaignCreateResponseJsonFormat: Format[CampaignCreateResponse] = Json.format[CampaignCreateResponse]
}

