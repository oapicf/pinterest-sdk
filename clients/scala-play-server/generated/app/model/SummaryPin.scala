package model

import play.api.libs.json._

/**
  * Summarized pin information
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SummaryPin(
  media: Option[PinMedia],
  altText: Option[String],
  link: Option[String],
  title: Option[String],
  description: Option[String]
)

object SummaryPin {
  implicit lazy val summaryPinJsonFormat: Format[SummaryPin] = Json.format[SummaryPin]
}

