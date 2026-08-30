package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Keyword.
  * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param id Keyword ID .
  * @param matchType Keyword [match type](/docs/api-features/targeting-overview/)
  * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
  * @param parentType Parent entity type (advertiser, campaign, ad group).
  * @param `type` Always keyword
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Keyword(
  archived: Option[Boolean],
  bid: Option[Int],
  id: String,
  matchType: MatchType,
  parentId: String,
  parentType: Option[String],
  `type`: Option[String],
  value: String
)

object Keyword {
  implicit lazy val keywordJsonFormat: Format[Keyword] = Json.format[Keyword]
}

