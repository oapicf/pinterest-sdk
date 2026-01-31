package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelUpdateRequest.
  * @param labels Labels that you are applying to the campaign.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelUpdateRequest(
  labels: List[LabelUpdateRequestLabelsInner]
)

object LabelUpdateRequest {
  implicit lazy val labelUpdateRequestJsonFormat: Format[LabelUpdateRequest] = Json.format[LabelUpdateRequest]
}

