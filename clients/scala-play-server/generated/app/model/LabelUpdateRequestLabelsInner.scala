package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelUpdateRequest_labels_inner.
  * @param id Label ID.
  * @param value Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelUpdateRequestLabelsInner(
  id: String,
  status: Option[LabelStatus],
  value: Option[String]
)

object LabelUpdateRequestLabelsInner {
  implicit lazy val labelUpdateRequestLabelsInnerJsonFormat: Format[LabelUpdateRequestLabelsInner] = Json.format[LabelUpdateRequestLabelsInner]
}

