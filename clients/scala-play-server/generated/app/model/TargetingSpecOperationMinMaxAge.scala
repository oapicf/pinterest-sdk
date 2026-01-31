package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationMinMaxAge.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingSpecOperationMinMaxAge(
  field: TargetingSpecOperationMinMaxAge.Field.Value,
  operation: TargetingSpecOperationMinMaxAge.Operation.Value,
  value: String
)

object TargetingSpecOperationMinMaxAge {
  implicit lazy val targetingSpecOperationMinMaxAgeJsonFormat: Format[TargetingSpecOperationMinMaxAge] = Json.format[TargetingSpecOperationMinMaxAge]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val MINIMUMAGE = Value("MINIMUM_AGE")
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

