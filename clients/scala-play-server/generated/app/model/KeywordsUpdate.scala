package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param keywords Keywords
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class KeywordsUpdate(
  keywords: Option[List[KeywordUpdateItem]]
)

object KeywordsUpdate {
  implicit lazy val keywordsUpdateJsonFormat: Format[KeywordsUpdate] = Json.format[KeywordsUpdate]
}

