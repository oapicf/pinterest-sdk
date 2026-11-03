package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for board_sections_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BoardSectionsList200Response(
  bookmark: Option[String],
  items: List[BoardSection]
)

object BoardSectionsList200Response {
  implicit lazy val boardSectionsList200ResponseJsonFormat: Format[BoardSectionsList200Response] = Json.format[BoardSectionsList200Response]
}

