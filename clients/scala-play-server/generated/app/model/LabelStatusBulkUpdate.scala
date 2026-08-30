package model

import play.api.libs.json._

/**
  * Set status to `ARCHIVED` to remove the label from the parent entity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LabelStatusBulkUpdate(
)

object LabelStatusBulkUpdate {
  implicit lazy val labelStatusBulkUpdateJsonFormat: Format[LabelStatusBulkUpdate] = Json.format[LabelStatusBulkUpdate]
}

