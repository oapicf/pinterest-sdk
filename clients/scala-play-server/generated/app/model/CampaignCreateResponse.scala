package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignCreateResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignCreateResponse(
  items: Option[List[CampaignCreateResponseItem]]
)

object CampaignCreateResponse {
  implicit lazy val campaignCreateResponseJsonFormat: Format[CampaignCreateResponse] = Json.format[CampaignCreateResponse]
}

