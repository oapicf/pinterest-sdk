package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class KeywordError(
  data: Option[Keyword],
  errorMessages: Option[List[String]]
)

object KeywordError {
  implicit lazy val keywordErrorJsonFormat: Format[KeywordError] = Json.format[KeywordError]
}

