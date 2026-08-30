package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelsResponse.
  * @param errors Labels that were not successfully applied.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LabelsResponse(
  errors: Option[List[LabelError]],
  labels: Option[List[Label]]
)

object LabelsResponse {
  implicit lazy val labelsResponseJsonFormat: Format[LabelsResponse] = Json.format[LabelsResponse]
}

