package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for board_sections_list_200_response.
  * @param items Board sections
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BoardSectionsList200Response(
  items: List[BoardSection],
  bookmark: Option[String]
)

object BoardSectionsList200Response {
  implicit lazy val boardSectionsList200ResponseJsonFormat: Format[BoardSectionsList200Response] = Json.format[BoardSectionsList200Response]
}

