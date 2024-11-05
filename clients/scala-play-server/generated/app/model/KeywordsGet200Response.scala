package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for keywords_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class KeywordsGet200Response(
  items: List[Keyword],
  bookmark: Option[String]
)

object KeywordsGet200Response {
  implicit lazy val keywordsGet200ResponseJsonFormat: Format[KeywordsGet200Response] = Json.format[KeywordsGet200Response]
}

