package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_pins_200_response.
  * @param items Pins
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BoardsListPins200Response(
  bookmark: Option[String],
  items: List[Pin]
)

object BoardsListPins200Response {
  implicit lazy val boardsListPins200ResponseJsonFormat: Format[BoardsListPins200Response] = Json.format[BoardsListPins200Response]
}

