package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for board_sections_list_200_response.
  * @param items Board sections
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BoardSectionsList200Response(
  items: List[BoardSection],
  bookmark: Option[String]
)

object BoardSectionsList200Response {
  implicit lazy val boardSectionsList200ResponseJsonFormat: Format[BoardSectionsList200Response] = Json.format[BoardSectionsList200Response]
}

