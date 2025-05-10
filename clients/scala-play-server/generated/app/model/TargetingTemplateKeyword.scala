package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateKeyword.
  * @param value The keyword targeting (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class TargetingTemplateKeyword(
  matchType: Option[MatchType],
  value: Option[String]
)

object TargetingTemplateKeyword {
  implicit lazy val targetingTemplateKeywordJsonFormat: Format[TargetingTemplateKeyword] = Json.format[TargetingTemplateKeyword]
}

