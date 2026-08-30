package model

import play.api.libs.json._

/**
  * Summarized pin information
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SummaryPin(
  altText: Option[String],
  description: Option[String],
  id: String,
  link: Option[String],
  media: Option[PinMedia],
  title: Option[String]
)

object SummaryPin {
  implicit lazy val summaryPinJsonFormat: Format[SummaryPin] = Json.format[SummaryPin]
}

