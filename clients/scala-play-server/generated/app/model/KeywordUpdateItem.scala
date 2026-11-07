package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordUpdateItem.
  * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param id Keyword ID .
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class KeywordUpdateItem(
  archived: Option[Boolean],
  bid: Option[Int],
  id: String
)

object KeywordUpdateItem {
  implicit lazy val keywordUpdateItemJsonFormat: Format[KeywordUpdateItem] = Json.format[KeywordUpdateItem]
}

