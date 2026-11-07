package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BoardsList200Response(
  bookmark: Option[String],
  items: List[Board]
)

object BoardsList200Response {
  implicit lazy val boardsList200ResponseJsonFormat: Format[BoardsList200Response] = Json.format[BoardsList200Response]
}

