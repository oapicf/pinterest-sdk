package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelCreateRequest.
  * @param labels Labels that you are applying to the campaign.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LabelCreateRequest(
  labels: List[LabelCreateItem]
)

object LabelCreateRequest {
  implicit lazy val labelCreateRequestJsonFormat: Format[LabelCreateRequest] = Json.format[LabelCreateRequest]
}

