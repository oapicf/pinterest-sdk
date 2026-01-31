package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for search_partner_pins_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SearchPartnerPins200Response(
  items: List[SummaryPin],
  bookmark: Option[String]
)

object SearchPartnerPins200Response {
  implicit lazy val searchPartnerPins200ResponseJsonFormat: Format[SearchPartnerPins200Response] = Json.format[SearchPartnerPins200Response]
}

