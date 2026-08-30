package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Label.
  * @param id Label ID.
  * @param value Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Label(
  id: String,
  labelType: NullableLabelType,
  status: Option[NullableLabelStatus],
  value: String
)

object Label {
  implicit lazy val labelJsonFormat: Format[Label] = Json.format[Label]
}

