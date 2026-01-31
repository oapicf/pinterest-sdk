package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for keywords_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class KeywordsGet200Response(
  bookmark: Option[String],
  items: List[Keyword]
)

object KeywordsGet200Response {
  implicit lazy val keywordsGet200ResponseJsonFormat: Format[KeywordsGet200Response] = Json.format[KeywordsGet200Response]
}

