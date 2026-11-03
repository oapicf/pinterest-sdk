package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupAudienceSizingKeyword.
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdGroupAudienceSizingKeyword(
  matchType: MatchType,
  value: String
)

object AdGroupAudienceSizingKeyword {
  implicit lazy val adGroupAudienceSizingKeywordJsonFormat: Format[AdGroupAudienceSizingKeyword] = Json.format[AdGroupAudienceSizingKeyword]
}

