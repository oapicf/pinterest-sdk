package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupAudienceSizingRequest_keywords_inner.
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdGroupAudienceSizingRequestKeywordsInner(
  matchType: MatchTypeResponse,
  value: String
)

object AdGroupAudienceSizingRequestKeywordsInner {
  implicit lazy val adGroupAudienceSizingRequestKeywordsInnerJsonFormat: Format[AdGroupAudienceSizingRequestKeywordsInner] = Json.format[AdGroupAudienceSizingRequestKeywordsInner]
}

