package model

import play.api.libs.json._

/**
  * Summarized pin information
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class SummaryPin(
  media: Option[SummaryPinMedia],
  altText: Option[String],
  link: Option[String],
  title: Option[String],
  description: Option[String]
)

object SummaryPin {
  implicit lazy val summaryPinJsonFormat: Format[SummaryPin] = Json.format[SummaryPin]
}

