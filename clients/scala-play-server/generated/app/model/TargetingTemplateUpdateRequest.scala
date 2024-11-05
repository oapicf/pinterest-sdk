package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateUpdateRequest.
  * @param id Targeting template ID
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TargetingTemplateUpdateRequest(
  operationType: TargetingTemplateUpdateRequest.OperationType.Value,
  id: String
)

object TargetingTemplateUpdateRequest {
  implicit lazy val targetingTemplateUpdateRequestJsonFormat: Format[TargetingTemplateUpdateRequest] = Json.format[TargetingTemplateUpdateRequest]

  // noinspection TypeAnnotation
  object OperationType extends Enumeration {
    val REMOVE = Value("REMOVE")

    type OperationType = Value
    implicit lazy val OperationTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

