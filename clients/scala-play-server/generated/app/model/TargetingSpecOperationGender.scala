package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationGender.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

