package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for keywords_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeywordsGet200Response(
  bookmark: Option[String],
  items: List[Keyword]
)

object KeywordsGet200Response {
  implicit lazy val keywordsGet200ResponseJsonFormat: Format[KeywordsGet200Response] = Json.format[KeywordsGet200Response]
}

