package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for board_sections_list_200_response.
  * @param items Board sections
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BoardSectionsList200Response(
  items: List[BoardSection],
  bookmark: Option[String]
)

object BoardSectionsList200Response {
  implicit lazy val boardSectionsList200ResponseJsonFormat: Format[BoardSectionsList200Response] = Json.format[BoardSectionsList200Response]
}

