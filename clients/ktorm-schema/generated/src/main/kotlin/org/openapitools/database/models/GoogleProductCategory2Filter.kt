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
 * @param GOOGLE_PRODUCT_CATEGORY_2 
 */
object GoogleProductCategory2Filters : BaseTable<GoogleProductCategory2Filter>("GoogleProductCategory2Filter") {
    val GOOGLE_PRODUCT_CATEGORY_2 = long("GOOGLE_PRODUCT_CATEGORY_2")

    /**
     * Create an entity of type GoogleProductCategory2Filter from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GoogleProductCategory2Filter(
        GOOGLE_PRODUCT_CATEGORY_2 = CatalogsProductGroupMultipleStringListCriterias.createEntity(row, withReferences) /* CatalogsProductGroupMultipleStringListCriteria */
    )

    /**
    * Assign all the columns from the entity of type GoogleProductCategory2Filter to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GoogleProductCategory2Filter()
    * database.update(GoogleProductCategory2Filters, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GoogleProductCategory2Filter) {
        this.apply {
            set(GoogleProductCategory2Filters.GOOGLE_PRODUCT_CATEGORY_2, entity.GOOGLE_PRODUCT_CATEGORY_2)
        }
    }

}


