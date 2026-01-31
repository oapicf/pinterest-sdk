package model

import play.api.libs.json._

/**
  * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelType(
)

object LabelType {
  implicit lazy val labelTypeJsonFormat: Format[LabelType] = Json.format[LabelType]
}

