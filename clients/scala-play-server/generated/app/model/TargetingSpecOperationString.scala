package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationString.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingSpecOperationString(
  field: String,
  operation: TargetingSpecOperationString.Operation.Value,
  value: String
)

object TargetingSpecOperationString {
  implicit lazy val targetingSpecOperationStringJsonFormat: Format[TargetingSpecOperationString] = Json.format[TargetingSpecOperationString]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val SET = Value("SET")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

