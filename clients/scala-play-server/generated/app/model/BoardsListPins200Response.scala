package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_pins_200_response.
  * @param items Pins
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BoardsListPins200Response(
  items: List[Pin],
  bookmark: Option[String]
)

object BoardsListPins200Response {
  implicit lazy val boardsListPins200ResponseJsonFormat: Format[BoardsListPins200Response] = Json.format[BoardsListPins200Response]
}

