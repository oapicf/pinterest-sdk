package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for search_partner_pins_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SearchPartnerPins200Response(
  items: List[SummaryPin],
  bookmark: Option[String]
)

object SearchPartnerPins200Response {
  implicit lazy val searchPartnerPins200ResponseJsonFormat: Format[SearchPartnerPins200Response] = Json.format[SearchPartnerPins200Response]
}

