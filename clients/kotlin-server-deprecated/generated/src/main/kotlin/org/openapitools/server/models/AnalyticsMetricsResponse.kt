/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.AnalyticsMetricsResponseDailyMetrics

/**
 * 
 * @param dailyMetrics Array with the requested daily metric records
 * @param summaryMetrics The metric name and value over the requested period for each requested metric
 */
data class AnalyticsMetricsResponse (
    /* Array with the requested daily metric records */
    val dailyMetrics: kotlin.Array<AnalyticsMetricsResponseDailyMetrics>? = null,
    /* The metric name and value over the requested period for each requested metric */
    val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
) 
