package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationAudienceExclude.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationAudienceExclude(
  field: TargetingSpecOperationAudienceExclude.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[String]
)

object TargetingSpecOperationAudienceExclude {
  implicit lazy val targetingSpecOperationAudienceExcludeJsonFormat: Format[TargetingSpecOperationAudienceExclude] = Json.format[TargetingSpecOperationAudienceExclude]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val AUDIENCEEXCLUDE = Value("AUDIENCE_EXCLUDE")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

