package model

import play.api.libs.json._

/**
  * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NullableLabelType(
)

object NullableLabelType {
  implicit lazy val nullableLabelTypeJsonFormat: Format[NullableLabelType] = Json.format[NullableLabelType]
}

