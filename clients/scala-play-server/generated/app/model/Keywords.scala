package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Keywords.
  * @param errors Keyword error
  * @param keywords Keywords
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Keywords(
  errors: List[KeywordError],
  keywords: List[Keyword]
)

object Keywords {
  implicit lazy val keywordsJsonFormat: Format[Keywords] = Json.format[Keywords]
}

