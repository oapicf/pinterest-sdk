package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupAudienceSizingKeyword.
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupAudienceSizingKeyword(
  matchType: MatchType,
  value: String
)

object AdGroupAudienceSizingKeyword {
  implicit lazy val adGroupAudienceSizingKeywordJsonFormat: Format[AdGroupAudienceSizingKeyword] = Json.format[AdGroupAudienceSizingKeyword]
}

