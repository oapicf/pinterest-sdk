package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_pins_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BoardsListPins200Response(
  bookmark: Option[String],
  items: List[PinRead]
)

object BoardsListPins200Response {
  implicit lazy val boardsListPins200ResponseJsonFormat: Format[BoardsListPins200Response] = Json.format[BoardsListPins200Response]
}

