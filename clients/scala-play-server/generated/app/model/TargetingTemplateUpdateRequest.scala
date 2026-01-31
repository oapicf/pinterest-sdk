package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateUpdateRequest.
  * @param id Targeting template ID
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateUpdateRequest(
  id: String,
  operationType: TargetingTemplateUpdateRequest.OperationType.Value,
  targetingAttributes: Option[TargetingSpec]
)

object TargetingTemplateUpdateRequest {
  implicit lazy val targetingTemplateUpdateRequestJsonFormat: Format[TargetingTemplateUpdateRequest] = Json.format[TargetingTemplateUpdateRequest]

  // noinspection TypeAnnotation
  object OperationType extends Enumeration {
    val REMOVE = Value("REMOVE")
    val UPDATE = Value("UPDATE")

    type OperationType = Value
    implicit lazy val OperationTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

