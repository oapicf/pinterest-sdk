package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelBulkCreateRequest.
  * @param labels Labels that you are applying to the campaign.
  * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabelBulkCreateRequest(
  labels: List[LabelCreateItem],
  parentId: String
)

object LabelBulkCreateRequest {
  implicit lazy val labelBulkCreateRequestJsonFormat: Format[LabelBulkCreateRequest] = Json.format[LabelBulkCreateRequest]
}

