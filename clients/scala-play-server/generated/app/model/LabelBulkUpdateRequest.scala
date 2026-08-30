package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelBulkUpdateRequest.
  * @param id Label ID.
  * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LabelBulkUpdateRequest(
  id: String,
  parentId: String,
  status: LabelStatusBulkUpdate
)

object LabelBulkUpdateRequest {
  implicit lazy val labelBulkUpdateRequestJsonFormat: Format[LabelBulkUpdateRequest] = Json.format[LabelBulkUpdateRequest]
}

