package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationLocale.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationLocale(
  field: TargetingSpecOperationLocale.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[String]
)

object TargetingSpecOperationLocale {
  implicit lazy val targetingSpecOperationLocaleJsonFormat: Format[TargetingSpecOperationLocale] = Json.format[TargetingSpecOperationLocale]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val LOCALE = Value("LOCALE")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

