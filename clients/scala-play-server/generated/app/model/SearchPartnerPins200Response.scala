package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for search_partner_pins_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SearchPartnerPins200Response(
  bookmark: Option[String],
  items: List[SummaryPin]
)

object SearchPartnerPins200Response {
  implicit lazy val searchPartnerPins200ResponseJsonFormat: Format[SearchPartnerPins200Response] = Json.format[SearchPartnerPins200Response]
}

