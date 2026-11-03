package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateUpdateRequestReadOrUpdate.
  * @param id Targeting template ID
  * @param targetingAttributes targeting profile attributes
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TargetingTemplateUpdateRequestReadOrUpdate(
  id: String,
  operationType: AudienceUpdateOperationType,
  targetingAttributes: Option[TargetingSpecOptimal]
)

object TargetingTemplateUpdateRequestReadOrUpdate {
  implicit lazy val targetingTemplateUpdateRequestReadOrUpdateJsonFormat: Format[TargetingTemplateUpdateRequestReadOrUpdate] = Json.format[TargetingTemplateUpdateRequestReadOrUpdate]
}

