package model

import play.api.libs.json._

/**
  * Array with metrics, status, and pin id for the requested metric
  * @param metrics The metric name and daily value for each requested metric
  * @param pinId The pin id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TopPinsAnalyticsResponsePinsInner(
  metrics: Option[Map[String, BigDecimal]],
  dataStatus: Option[Map[String, DataStatus]],
  pinId: Option[String]
)

object TopPinsAnalyticsResponsePinsInner {
  implicit lazy val topPinsAnalyticsResponsePinsInnerJsonFormat: Format[TopPinsAnalyticsResponsePinsInner] = Json.format[TopPinsAnalyticsResponsePinsInner]
}

