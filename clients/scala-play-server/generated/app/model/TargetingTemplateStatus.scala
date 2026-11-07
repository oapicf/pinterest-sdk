package model

import play.api.libs.json._

/**
  * Indicate targeting template is active or Deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TargetingTemplateStatus(
)

object TargetingTemplateStatus {
  implicit lazy val targetingTemplateStatusJsonFormat: Format[TargetingTemplateStatus] = Json.format[TargetingTemplateStatus]
}

