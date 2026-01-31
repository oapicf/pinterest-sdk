package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateKeyword.
  * @param value The keyword targeting (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateKeyword(
  matchType: Option[MatchType],
  value: Option[String]
)

object TargetingTemplateKeyword {
  implicit lazy val targetingTemplateKeywordJsonFormat: Format[TargetingTemplateKeyword] = Json.format[TargetingTemplateKeyword]
}

