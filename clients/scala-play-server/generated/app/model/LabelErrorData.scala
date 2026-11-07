package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabelErrorData.
  * @param id Label ID.
  * @param value Label name. 100-character limit.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabelErrorData(
  id: Option[String],
  labelType: Option[NullableLabelType],
  status: Option[NullableLabelStatus],
  value: Option[String]
)

object LabelErrorData {
  implicit lazy val labelErrorDataJsonFormat: Format[LabelErrorData] = Json.format[LabelErrorData]
}

