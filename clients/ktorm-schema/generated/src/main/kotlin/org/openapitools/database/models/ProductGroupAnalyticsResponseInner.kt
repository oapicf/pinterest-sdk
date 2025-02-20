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
 * @param PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to.
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 */
object ProductGroupAnalyticsResponseInners : BaseTable<ProductGroupAnalyticsResponseInner>("ProductGroupAnalyticsResponse_inner") {
    val PRODUCT_GROUP_ID = text("PRODUCT_GROUP_ID") /* The ID of the product group that this metrics belongs to. */
    val DATE = date("DATE") /* null */ /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */

    /**
     * Create an entity of type ProductGroupAnalyticsResponseInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ProductGroupAnalyticsResponseInner(
        PRODUCT_GROUP_ID = row[PRODUCT_GROUP_ID] ?: "" /* kotlin.String */ /* The ID of the product group that this metrics belongs to. */,
        DATE = row[DATE]  /* java.time.LocalDate? */ /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    )

    /**
    * Assign all the columns from the entity of type ProductGroupAnalyticsResponseInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ProductGroupAnalyticsResponseInner()
    * database.update(ProductGroupAnalyticsResponseInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ProductGroupAnalyticsResponseInner) {
        this.apply {
            set(ProductGroupAnalyticsResponseInners.PRODUCT_GROUP_ID, entity.PRODUCT_GROUP_ID)
            set(ProductGroupAnalyticsResponseInners.DATE, entity.DATE)
        }
    }

}


