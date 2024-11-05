package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_pins_200_response.
  * @param items Pins
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BoardsListPins200Response(
  items: List[Pin],
  bookmark: Option[String]
)

object BoardsListPins200Response {
  implicit lazy val boardsListPins200ResponseJsonFormat: Format[BoardsListPins200Response] = Json.format[BoardsListPins200Response]
}

