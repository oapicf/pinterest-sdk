package model

import play.api.libs.json._

/**
  * Array with metrics, status, and pin id for the requested metric
  * @param metrics The metric name and daily value for each requested metric
  * @param pinId The pin id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TopPinsAnalyticsResponsePinsInner(
  dataStatus: Option[Map[String, DataStatus]],
  metrics: Option[Map[String, BigDecimal]],
  pinId: Option[String]
)

object TopPinsAnalyticsResponsePinsInner {
  implicit lazy val topPinsAnalyticsResponsePinsInnerJsonFormat: Format[TopPinsAnalyticsResponsePinsInner] = Json.format[TopPinsAnalyticsResponsePinsInner]
}

