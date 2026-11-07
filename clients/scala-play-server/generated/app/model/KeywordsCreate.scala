package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param keywords Keywords
  * @param parentId Keyword data
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class KeywordsCreate(
  keywords: List[KeywordCreateItem],
  parentId: String
)

object KeywordsCreate {
  implicit lazy val keywordsCreateJsonFormat: Format[KeywordsCreate] = Json.format[KeywordsCreate]
}

