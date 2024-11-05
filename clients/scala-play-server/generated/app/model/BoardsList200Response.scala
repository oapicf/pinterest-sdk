package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_200_response.
  * @param items Boards
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BoardsList200Response(
  items: List[Board],
  bookmark: Option[String]
)

object BoardsList200Response {
  implicit lazy val boardsList200ResponseJsonFormat: Format[BoardsList200Response] = Json.format[BoardsList200Response]
}

