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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param dataStatus 
 * @param date Metrics date (UTC): YYYY-MM-DD.
 * @param metrics The metric name and daily value for each requested metric
 */
object PinAnalyticsMetricsResponseDailyMetricsInners : BaseTable<PinAnalyticsMetricsResponseDailyMetricsInner>("PinAnalyticsMetricsResponse_daily_metrics_inner") {
    val dataStatus = long("data_status") /* null */
    val date = text("date") /* null */ /* Metrics date (UTC): YYYY-MM-DD. */
    val metrics = blob("metrics") /* null */ /* The metric name and daily value for each requested metric */

    /**
     * Create an entity of type PinAnalyticsMetricsResponseDailyMetricsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = PinAnalyticsMetricsResponseDailyMetricsInner(
        dataStatus = DataStatuss.createEntity(row, withReferences) /* DataStatus? */,
        date = row[date]  /* kotlin.String? */ /* Metrics date (UTC): YYYY-MM-DD. */,
        metrics = row[metrics]  /* kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? */ /* The metric name and daily value for each requested metric */
    )

    /**
    * Assign all the columns from the entity of type PinAnalyticsMetricsResponseDailyMetricsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = PinAnalyticsMetricsResponseDailyMetricsInner()
    * database.update(PinAnalyticsMetricsResponseDailyMetricsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: PinAnalyticsMetricsResponseDailyMetricsInner) {
        this.apply {
            set(PinAnalyticsMetricsResponseDailyMetricsInners.dataStatus, entity.dataStatus)
            set(PinAnalyticsMetricsResponseDailyMetricsInners.date, entity.date)
            set(PinAnalyticsMetricsResponseDailyMetricsInners.metrics, entity.metrics)
        }
    }

}


