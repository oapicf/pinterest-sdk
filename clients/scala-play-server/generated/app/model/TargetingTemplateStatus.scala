package model

import play.api.libs.json._

/**
  * Indicate targeting template is active or Deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingTemplateStatus(
)

object TargetingTemplateStatus {
  implicit lazy val targetingTemplateStatusJsonFormat: Format[TargetingTemplateStatus] = Json.format[TargetingTemplateStatus]
}

