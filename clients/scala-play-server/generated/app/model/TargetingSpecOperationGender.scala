package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationGender.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TargetingSpecOperationGender(
  field: TargetingSpecOperationGender.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[TargetingSpecGender]
)

object TargetingSpecOperationGender {
  implicit lazy val targetingSpecOperationGenderJsonFormat: Format[TargetingSpecOperationGender] = Json.format[TargetingSpecOperationGender]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val GENDER = Value("GENDER")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

