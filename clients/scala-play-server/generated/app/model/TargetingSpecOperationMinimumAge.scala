package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationMinimumAge.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationMinimumAge(
  field: TargetingSpecOperationMinimumAge.Field.Value,
  operation: TargetingSpecOperationMinimumAge.Operation.Value,
  value: String
)

object TargetingSpecOperationMinimumAge {
  implicit lazy val targetingSpecOperationMinimumAgeJsonFormat: Format[TargetingSpecOperationMinimumAge] = Json.format[TargetingSpecOperationMinimumAge]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val MINIMUMAGE = Value("MINIMUM_AGE")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val SET = Value("SET")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

