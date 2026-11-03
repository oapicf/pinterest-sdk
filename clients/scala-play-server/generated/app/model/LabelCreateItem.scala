package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelCreateItem.
  * @param value Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabelCreateItem(
  labelType: LabelType,
  value: String
)

object LabelCreateItem {
  implicit lazy val labelCreateItemJsonFormat: Format[LabelCreateItem] = Json.format[LabelCreateItem]
}

