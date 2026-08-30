package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelCreateItem.
  * @param value Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LabelCreateItem(
  labelType: LabelType,
  value: String
)

object LabelCreateItem {
  implicit lazy val labelCreateItemJsonFormat: Format[LabelCreateItem] = Json.format[LabelCreateItem]
}

