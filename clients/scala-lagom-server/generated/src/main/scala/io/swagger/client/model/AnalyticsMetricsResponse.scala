/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._

case class AnalyticsMetricsResponse (
            /* The metric name and value over the requested period for each requested metric */
                  summaryMetrics: Option[Map[String, Number]],
            /* Array with the requested daily metric records */
                  dailyMetrics: Option[Seq[AnalyticsDailyMetrics]]
)

object AnalyticsMetricsResponse {
implicit val format: Format[AnalyticsMetricsResponse] = Json.format
}
