package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationGeo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationGeo(
  field: TargetingSpecOperationGeo.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[String]
)

object TargetingSpecOperationGeo {
  implicit lazy val targetingSpecOperationGeoJsonFormat: Format[TargetingSpecOperationGeo] = Json.format[TargetingSpecOperationGeo]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val GEO = Value("GEO")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

