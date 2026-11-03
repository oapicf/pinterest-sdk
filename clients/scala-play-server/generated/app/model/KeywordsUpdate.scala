package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param keywords Keywords
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class KeywordsUpdate(
  keywords: Option[List[KeywordUpdateItem]]
)

object KeywordsUpdate {
  implicit lazy val keywordsUpdateJsonFormat: Format[KeywordsUpdate] = Json.format[KeywordsUpdate]
}

