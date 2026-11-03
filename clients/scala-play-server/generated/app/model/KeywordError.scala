package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class KeywordError(
  data: Option[Keyword],
  errorMessages: Option[List[String]]
)

object KeywordError {
  implicit lazy val keywordErrorJsonFormat: Format[KeywordError] = Json.format[KeywordError]
}

