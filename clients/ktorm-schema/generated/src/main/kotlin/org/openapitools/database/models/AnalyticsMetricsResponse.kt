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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param summaryMetrics The metric name and value over the requested period for each requested metric
 * @param dailyMetrics Array with the requested daily metric records
 */
object AnalyticsMetricsResponses : BaseTable<AnalyticsMetricsResponse>("AnalyticsMetricsResponse") {
    val summaryMetrics = blob("summary_metrics") /* null */ /* The metric name and value over the requested period for each requested metric */

    /**
     * Create an entity of type AnalyticsMetricsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AnalyticsMetricsResponse(
        summaryMetrics = row[summaryMetrics]  /* kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? */ /* The metric name and value over the requested period for each requested metric */,
        dailyMetrics = emptyList() /* kotlin.Array<AnalyticsDailyMetrics>? */ /* Array with the requested daily metric records */
    )

    /**
    * Assign all the columns from the entity of type AnalyticsMetricsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AnalyticsMetricsResponse()
    * database.update(AnalyticsMetricsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AnalyticsMetricsResponse) {
        this.apply {
            set(AnalyticsMetricsResponses.summaryMetrics, entity.summaryMetrics)
        }
    }

}


object AnalyticsMetricsResponseAnalyticsDailyMetrics : BaseTable<Pair<kotlin.Long, kotlin.Long>>("AnalyticsMetricsResponseAnalyticsDailyMetrics") {
    val analyticsMetricsResponse = long("analyticsMetricsResponse")
    val analyticsDailyMetrics = long("analyticsDailyMetrics")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[analyticsMetricsResponse] ?: 0, row[analyticsDailyMetrics] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(AnalyticsMetricsResponseAnalyticsDailyMetrics.analyticsMetricsResponse, entity.first)
            set(AnalyticsMetricsResponseAnalyticsDailyMetrics.analyticsDailyMetrics, entity.second)
        }
    }

}
