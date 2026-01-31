package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class KeywordsResponse(
  errors: Option[List[KeywordError]],
  keywords: Option[List[Keyword]]
)

object KeywordsResponse {
  implicit lazy val keywordsResponseJsonFormat: Format[KeywordsResponse] = Json.format[KeywordsResponse]
}

