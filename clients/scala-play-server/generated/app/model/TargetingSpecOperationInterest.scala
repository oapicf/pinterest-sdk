package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationInterest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationInterest(
  field: TargetingSpecOperationInterest.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[String]
)

object TargetingSpecOperationInterest {
  implicit lazy val targetingSpecOperationInterestJsonFormat: Format[TargetingSpecOperationInterest] = Json.format[TargetingSpecOperationInterest]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val INTEREST = Value("INTEREST")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

