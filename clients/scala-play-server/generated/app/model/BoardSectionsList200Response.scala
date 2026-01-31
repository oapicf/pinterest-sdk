package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for board_sections_list_200_response.
  * @param items Board sections
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BoardSectionsList200Response(
  bookmark: Option[String],
  items: List[BoardSection]
)

object BoardSectionsList200Response {
  implicit lazy val boardSectionsList200ResponseJsonFormat: Format[BoardSectionsList200Response] = Json.format[BoardSectionsList200Response]
}

