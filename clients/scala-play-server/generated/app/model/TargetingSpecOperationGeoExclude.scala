package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationGeoExclude.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationGeoExclude(
  field: TargetingSpecOperationGeoExclude.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[String]
)

object TargetingSpecOperationGeoExclude {
  implicit lazy val targetingSpecOperationGeoExcludeJsonFormat: Format[TargetingSpecOperationGeoExclude] = Json.format[TargetingSpecOperationGeoExclude]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val GEOEXCLUDE = Value("GEO_EXCLUDE")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

