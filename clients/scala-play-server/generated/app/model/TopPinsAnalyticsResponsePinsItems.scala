package model

import play.api.libs.json._

/**
  * Array with metrics, status, and pin id for the requested metric
  * @param pinId The pin id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TopPinsAnalyticsResponsePinsItems(
  dataStatus: Option[Map[String, DataStatus]],
  metrics: Option[Map[String, BigDecimal]],
  pinId: Option[String]
)

object TopPinsAnalyticsResponsePinsItems {
  implicit lazy val topPinsAnalyticsResponsePinsItemsJsonFormat: Format[TopPinsAnalyticsResponsePinsItems] = Json.format[TopPinsAnalyticsResponsePinsItems]
}

