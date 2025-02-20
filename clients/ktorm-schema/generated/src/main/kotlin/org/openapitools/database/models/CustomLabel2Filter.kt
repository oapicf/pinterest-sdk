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
 * @param CUSTOM_LABEL_2 
 */
object CustomLabel2Filters : BaseTable<CustomLabel2Filter>("CustomLabel2Filter") {
    val CUSTOM_LABEL_2 = long("CUSTOM_LABEL_2")

    /**
     * Create an entity of type CustomLabel2Filter from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CustomLabel2Filter(
        CUSTOM_LABEL_2 = CatalogsProductGroupMultipleStringCriterias.createEntity(row, withReferences) /* CatalogsProductGroupMultipleStringCriteria */
    )

    /**
    * Assign all the columns from the entity of type CustomLabel2Filter to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CustomLabel2Filter()
    * database.update(CustomLabel2Filters, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CustomLabel2Filter) {
        this.apply {
            set(CustomLabel2Filters.CUSTOM_LABEL_2, entity.CUSTOM_LABEL_2)
        }
    }

}


