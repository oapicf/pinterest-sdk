package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeywordError(
  data: Option[Keyword],
  errorMessages: Option[List[String]]
)

object KeywordError {
  implicit lazy val keywordErrorJsonFormat: Format[KeywordError] = Json.format[KeywordError]
}

