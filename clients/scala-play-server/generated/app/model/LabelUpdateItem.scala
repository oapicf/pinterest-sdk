package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelUpdateItem.
  * @param id Label ID.
  * @param value Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabelUpdateItem(
  id: String,
  status: Option[LabelStatus],
  value: Option[String]
)

object LabelUpdateItem {
  implicit lazy val labelUpdateItemJsonFormat: Format[LabelUpdateItem] = Json.format[LabelUpdateItem]
}

