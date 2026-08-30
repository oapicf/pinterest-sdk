package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationAgeBucket.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationAgeBucket(
  field: TargetingSpecOperationAgeBucket.Field.Value,
  operation: TargetingSpecOperationAgeBucket.Operation.Value,
  values: List[TargetingSpecAgeBucket]
)

object TargetingSpecOperationAgeBucket {
  implicit lazy val targetingSpecOperationAgeBucketJsonFormat: Format[TargetingSpecOperationAgeBucket] = Json.format[TargetingSpecOperationAgeBucket]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val AGEBUCKET = Value("AGE_BUCKET")

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

