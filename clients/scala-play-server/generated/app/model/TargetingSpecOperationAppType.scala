package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationAppType.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingSpecOperationAppType(
  field: TargetingSpecOperationAppType.Field.Value,
  operation: TargetingSpecOperationAppType.Operation.Value,
  values: List[TargetingSpecAppType]
)

object TargetingSpecOperationAppType {
  implicit lazy val targetingSpecOperationAppTypeJsonFormat: Format[TargetingSpecOperationAppType] = Json.format[TargetingSpecOperationAppType]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val APPTYPE = Value("APPTYPE")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val SET = Value("SET")
    val ADD = Value("ADD")
    val REMOVE = Value("REMOVE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

