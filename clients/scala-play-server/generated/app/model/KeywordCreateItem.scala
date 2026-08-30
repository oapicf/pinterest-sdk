package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordCreateItem.
  * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param matchType Keyword [match type](/docs/api-features/targeting-overview/)
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeywordCreateItem(
  bid: Option[Int],
  matchType: MatchType,
  value: String
)

object KeywordCreateItem {
  implicit lazy val keywordCreateItemJsonFormat: Format[KeywordCreateItem] = Json.format[KeywordCreateItem]
}

