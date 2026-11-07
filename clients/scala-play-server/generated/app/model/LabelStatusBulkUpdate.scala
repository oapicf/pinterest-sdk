package model

import play.api.libs.json._

/**
  * Set status to `ARCHIVED` to remove the label from the parent entity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabelStatusBulkUpdate(
)

object LabelStatusBulkUpdate {
  implicit lazy val labelStatusBulkUpdateJsonFormat: Format[LabelStatusBulkUpdate] = Json.format[LabelStatusBulkUpdate]
}

