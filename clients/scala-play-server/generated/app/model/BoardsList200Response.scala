package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BoardsList200Response(
  bookmark: Option[String],
  items: List[Board]
)

object BoardsList200Response {
  implicit lazy val boardsList200ResponseJsonFormat: Format[BoardsList200Response] = Json.format[BoardsList200Response]
}

