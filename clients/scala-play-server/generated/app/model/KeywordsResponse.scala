package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class KeywordsResponse(
  errors: Option[List[KeywordError]],
  keywords: Option[List[Keyword]]
)

object KeywordsResponse {
  implicit lazy val keywordsResponseJsonFormat: Format[KeywordsResponse] = Json.format[KeywordsResponse]
}

