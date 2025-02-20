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
 */
object PinsAnalyticsMetricTypesParameterInners : BaseTable<PinsAnalyticsMetricTypesParameterInner>("pins_analytics_metric_types_parameter_inner") {

    /**
     * Create an entity of type PinsAnalyticsMetricTypesParameterInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = PinsAnalyticsMetricTypesParameterInner(
    )

    /**
    * Assign all the columns from the entity of type PinsAnalyticsMetricTypesParameterInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = PinsAnalyticsMetricTypesParameterInner()
    * database.update(PinsAnalyticsMetricTypesParameterInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: PinsAnalyticsMetricTypesParameterInner) {
        this.apply {
        }
    }

}


