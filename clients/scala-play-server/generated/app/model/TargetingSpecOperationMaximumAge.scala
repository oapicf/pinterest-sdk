package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationMaximumAge.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationMaximumAge(
  field: TargetingSpecOperationMaximumAge.Field.Value,
  operation: TargetingSpecOperationMaximumAge.Operation.Value,
  value: String
)

object TargetingSpecOperationMaximumAge {
  implicit lazy val targetingSpecOperationMaximumAgeJsonFormat: Format[TargetingSpecOperationMaximumAge] = Json.format[TargetingSpecOperationMaximumAge]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val MAXIMUMAGE = Value("MAXIMUM_AGE")

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

