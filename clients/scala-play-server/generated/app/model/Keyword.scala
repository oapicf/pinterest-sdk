package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Keyword.
  * @param id Keyword ID .
  * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
  * @param parentType Parent entity type
  * @param `type` Always keyword
  * @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Keyword(
  archived: Option[Boolean],
  id: Option[String],
  parentId: Option[String],
  parentType: Option[String],
  `type`: Option[String],
  bid: Option[Int],
  matchType: MatchTypeResponse,
  value: String
)

object Keyword {
  implicit lazy val keywordJsonFormat: Format[Keyword] = Json.format[Keyword]
}

