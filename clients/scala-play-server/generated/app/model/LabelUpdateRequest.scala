package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelUpdateRequest.
  * @param labels Labels that you are applying to the campaign.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabelUpdateRequest(
  labels: List[LabelUpdateItem]
)

object LabelUpdateRequest {
  implicit lazy val labelUpdateRequestJsonFormat: Format[LabelUpdateRequest] = Json.format[LabelUpdateRequest]
}

