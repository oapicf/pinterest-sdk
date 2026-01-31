package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_200_response.
  * @param items Boards
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BoardsList200Response(
  items: List[Board],
  bookmark: Option[String]
)

object BoardsList200Response {
  implicit lazy val boardsList200ResponseJsonFormat: Format[BoardsList200Response] = Json.format[BoardsList200Response]
}

