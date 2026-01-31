package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelCreateRequest_labels_inner.
  * @param value Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelCreateRequestLabelsInner(
  labelType: LabelType,
  value: String
)

object LabelCreateRequestLabelsInner {
  implicit lazy val labelCreateRequestLabelsInnerJsonFormat: Format[LabelCreateRequestLabelsInner] = Json.format[LabelCreateRequestLabelsInner]
}

