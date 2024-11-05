package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for search_partner_pins_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SearchPartnerPins200Response(
  items: List[SummaryPin],
  bookmark: Option[String]
)

object SearchPartnerPins200Response {
  implicit lazy val searchPartnerPins200ResponseJsonFormat: Format[SearchPartnerPins200Response] = Json.format[SearchPartnerPins200Response]
}

