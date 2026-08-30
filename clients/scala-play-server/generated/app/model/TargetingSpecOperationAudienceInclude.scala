package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationAudienceInclude.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationAudienceInclude(
  field: TargetingSpecOperationAudienceInclude.Field.Value,
  operation: TargetingSpecListOperation,
  values: List[String]
)

object TargetingSpecOperationAudienceInclude {
  implicit lazy val targetingSpecOperationAudienceIncludeJsonFormat: Format[TargetingSpecOperationAudienceInclude] = Json.format[TargetingSpecOperationAudienceInclude]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val AUDIENCEINCLUDE = Value("AUDIENCE_INCLUDE")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

