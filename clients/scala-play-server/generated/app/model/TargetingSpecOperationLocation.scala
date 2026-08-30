package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationLocation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationLocation(
  field: TargetingSpecOperationLocation.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[String]
)

object TargetingSpecOperationLocation {
  implicit lazy val targetingSpecOperationLocationJsonFormat: Format[TargetingSpecOperationLocation] = Json.format[TargetingSpecOperationLocation]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val LOCATION = Value("LOCATION")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

