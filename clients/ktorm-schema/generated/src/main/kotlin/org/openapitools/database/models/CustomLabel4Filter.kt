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
 * @param CUSTOM_LABEL_4 
 */
object CustomLabel4Filters : BaseTable<CustomLabel4Filter>("CustomLabel4Filter") {
    val CUSTOM_LABEL_4 = long("CUSTOM_LABEL_4")

    /**
     * Create an entity of type CustomLabel4Filter from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CustomLabel4Filter(
        CUSTOM_LABEL_4 = CatalogsProductGroupMultipleStringCriterias.createEntity(row, withReferences) /* CatalogsProductGroupMultipleStringCriteria */
    )

    /**
    * Assign all the columns from the entity of type CustomLabel4Filter to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CustomLabel4Filter()
    * database.update(CustomLabel4Filters, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CustomLabel4Filter) {
        this.apply {
            set(CustomLabel4Filters.CUSTOM_LABEL_4, entity.CUSTOM_LABEL_4)
        }
    }

}


