package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordsCommon.
  * @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class KeywordsCommon(
  bid: Option[Int],
  matchType: MatchTypeResponse,
  value: String
)

object KeywordsCommon {
  implicit lazy val keywordsCommonJsonFormat: Format[KeywordsCommon] = Json.format[KeywordsCommon]
}

