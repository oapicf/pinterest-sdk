/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._
import java.time.LocalDate
import java.util.HashMap

case class AdsAnalyticsResponseInner (
            /* The ID of the ad that this metrics belongs to. */
                  AD_ID: String,
            /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
                  DATE: Option[LocalDate]
)

object AdsAnalyticsResponseInner {
implicit val format: Format[AdsAnalyticsResponseInner] = Json.format
}

