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
 * @param scrollupGoalValueInMicroCurrency 
 */
object OptimizationGoalMetadataScrollupGoalMetadatas : BaseTable<OptimizationGoalMetadataScrollupGoalMetadata>("OptimizationGoalMetadata_scrollup_goal_metadata") {
    val scrollupGoalValueInMicroCurrency = text("scrollup_goal_value_in_micro_currency") /* null */

    /**
     * Create an entity of type OptimizationGoalMetadataScrollupGoalMetadata from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OptimizationGoalMetadataScrollupGoalMetadata(
        scrollupGoalValueInMicroCurrency = row[scrollupGoalValueInMicroCurrency]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type OptimizationGoalMetadataScrollupGoalMetadata to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OptimizationGoalMetadataScrollupGoalMetadata()
    * database.update(OptimizationGoalMetadataScrollupGoalMetadatas, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OptimizationGoalMetadataScrollupGoalMetadata) {
        this.apply {
            set(OptimizationGoalMetadataScrollupGoalMetadatas.scrollupGoalValueInMicroCurrency, entity.scrollupGoalValueInMicroCurrency)
        }
    }

}

