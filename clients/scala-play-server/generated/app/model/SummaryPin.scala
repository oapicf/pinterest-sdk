package model

import play.api.libs.json._

/**
  * Summarized pin information
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

