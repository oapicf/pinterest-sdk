package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_200_response.
  * @param items Boards
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BoardsList200Response(
  items: List[Board],
  bookmark: Option[String]
)

object BoardsList200Response {
  implicit lazy val boardsList200ResponseJsonFormat: Format[BoardsList200Response] = Json.format[BoardsList200Response]
}

