package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelBulkUpdateRequest.
  * @param id Label ID.
  * @param status Set status to `ARCHIVED` to remove the label from the parent entity.
  * @param value </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelBulkUpdateRequest(
  id: String,
  status: Option[LabelBulkUpdateRequest.Status.Value],
  value: Option[String]
)

object LabelBulkUpdateRequest {
  implicit lazy val labelBulkUpdateRequestJsonFormat: Format[LabelBulkUpdateRequest] = Json.format[LabelBulkUpdateRequest]

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val ARCHIVED = Value("ARCHIVED")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

