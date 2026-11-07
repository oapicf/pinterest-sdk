package model

import play.api.libs.json._

/**
  * Array with metrics, status, and pin id for the requested metric
  * @param pinId The pin id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TopPinsAnalyticsResponsePinsItems(
  dataStatus: Option[Map[String, DataStatus]],
  metrics: Option[Map[String, BigDecimal]],
  pinId: Option[String]
)

object TopPinsAnalyticsResponsePinsItems {
  implicit lazy val topPinsAnalyticsResponsePinsItemsJsonFormat: Format[TopPinsAnalyticsResponsePinsItems] = Json.format[TopPinsAnalyticsResponsePinsItems]
}

