package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelCreateRequest.
  * @param labels Labels that you are applying to the campaign.
  * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelCreateRequest(
  labels: List[LabelCreateRequestLabelsInner],
  parentId: String
)

object LabelCreateRequest {
  implicit lazy val labelCreateRequestJsonFormat: Format[LabelCreateRequest] = Json.format[LabelCreateRequest]
}

