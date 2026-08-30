package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationAppType.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationAppType(
  field: TargetingSpecOperationAppType.Field.Value,
  operation: TargetingSpecListOperation,
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
}

